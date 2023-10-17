package a_LoginFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import g_Objects.LoginPageObejcts;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InvalidInputs {
    private WebDriver driver;
    private LoginPageObejcts loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_files\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        loginPage = new LoginPageObejcts(driver);
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\WINDOWS 11 PRO\\eclipse-workspace\\OrangeHRM_Project\\src\\OrangeHrmData.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount - 1][2]; 

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            String username = (row.getCell(0) != null) ? row.getCell(0).toString() : "";
            String password = (row.getCell(1) != null) ? row.getCell(1).toString() : "";
            data[i - 1] = new Object[]{username, password};
        }

        workbook.close();
        return data;
    }

    @Test(dataProvider = "credentials")
    public void testLogin(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        if (username.isEmpty() || password.isEmpty()) {
            Assert.assertTrue(loginPage.getErrorMessage().equalsIgnoreCase("Required"));
        } else if (loginPage.getErrorMessage().equalsIgnoreCase("Invalid credentials")) {
            System.out.println("Test Passed: Invalid credentials");
        } else if (loginPage.getSuccessMessage().equalsIgnoreCase("Dashboard")) {
            System.out.println("Test Passed: Successful Login");
        } else {
            System.out.println("Test Failed: Unsuccessful Login");
        }

        
        System.out.println("Test case is successful with invalid inputs");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

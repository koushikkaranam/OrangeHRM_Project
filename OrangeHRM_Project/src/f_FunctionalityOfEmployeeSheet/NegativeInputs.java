package f_FunctionalityOfEmployeeSheet;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import g_Objects.EmployeeTimeSheetObjects;
import g_Objects.HomePageObjects;
import g_Objects.LoginPageObejcts;

public class NegativeInputs {
    private WebDriver driver;
    private LoginPageObejcts loginPage;
    private HomePageObjects homePage;

    @BeforeTest
    public void setUp() {
     
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_files\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    
        loginPage = new LoginPageObejcts(driver);
        
    }

    @Test
    public void testLoginAndRedirection() {
        
        loginPage.performLogin("Admin", "admin123");
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        HomePageObjects.clickTimeModule();
        HomePageObjects.clickTimesheet();
        EmployeeTimeSheetObjects.clickEmployeeTimeSheet();
        EmployeeTimeSheetObjects.EmployeeNameField("123#");
        EmployeeTimeSheetObjects.clickView();
    }
        
        
     @AfterTest
        public void tearDown() {
           
            if (driver != null) {
                driver.quit();
            }
        
        
        
    }
}
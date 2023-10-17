package a_LoginFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import g_Objects.LoginPageObejcts;

public class ValidInputs {
    private WebDriver driver;
    private LoginPageObejcts loginPage;
    
    @BeforeMethod
    public void setup() {
        
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
    public void testLoginWithValidCredentials() {
       
        String username = "Admin";
        String password = "admin123";
        
       
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        
        String successMessage = loginPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Dashboard");
    }
    
    @AfterMethod
    public void teardown() {
       
        driver.quit();
    }
}

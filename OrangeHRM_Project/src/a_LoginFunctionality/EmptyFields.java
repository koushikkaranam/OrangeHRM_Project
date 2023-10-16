package a_LoginFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


import Objects.LoginPageObejcts;

public class EmptyFields {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_files\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    @Test
    public void testLoginWithEmptyFields() {
        LoginPageObejcts loginPage = new LoginPageObejcts(driver);

       loginPage.performLogin("", "");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        try {
            String Message = loginPage.getErrorMessage();
            
            Assert.fail("Test case failed: Login with empty fields is not expected to succeed.");
        } catch (Exception e) {
           
            System.out.println("Test case is successful with empty fields.");
        }
    }

    @AfterClass
    public void tearDown() {
       
        driver.quit();
    }
}

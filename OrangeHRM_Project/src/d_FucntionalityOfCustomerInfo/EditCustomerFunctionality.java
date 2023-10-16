package d_FucntionalityOfCustomerInfo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Objects.HomePageObjects;
import Objects.LoginPageObejcts;
import Objects.TimemodulePageObjects;

public class EditCustomerFunctionality {
    private WebDriver driver;
    private LoginPageObejcts loginPage;
    private HomePageObjects homePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium_files\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        

        loginPage = new LoginPageObejcts(driver);
        homePage = new HomePageObjects();
    }

    @Test
    public void testLoginAndHelptool() {
        
        loginPage.performLogin("Admin", "admin123");

		try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    HomePageObjects.clickTimeModule();
		TimemodulePageObjects.clickProjectInfo();
		TimemodulePageObjects.clickCustomerInfo();
		TimemodulePageObjects.clickEditCustomer();
		

		WebElement EditCustomer = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6"));
		if (EditCustomer.isDisplayed()) {
			System.out.println("Customer Info Edited  Successfully");
		} else {
			System.out.println("Test Case Failed");
		}
		
    }

	@AfterTest
    public void tearDown() {
        driver.quit();
    }
		
    }

		
		
		
		
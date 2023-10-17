package c_FunctionalityOfTimeModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import g_Objects.HomePageObjects;
import g_Objects.LoginPageObejcts;

import org.testng.Assert;

public class VisibilityOfTimeSheetDropDown {
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
		
		 
		 
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	    	WebElement SearchOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
			if (SearchOption.isDisplayed()) {
				System.out.println("Time Sheet Components are Visible sucessfully ");
			} else {
				System.out.println("Test Case Failed");
			}
    }
			
			
            @AfterTest
		    public void tearDown() {
		        driver.quit();
		    }
		}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    		
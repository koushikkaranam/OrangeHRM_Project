package e_FunctionalityOfProjectInfo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import g_Objects.AddCutomerPageObjects;
import g_Objects.HomePageObjects;
import g_Objects.LoginPageObejcts;
import g_Objects.TimemodulePageObjects;

public class AddCustomerFunctionality {
    private WebDriver driver;
    private LoginPageObejcts loginPage;
    private HomePageObjects homePage;
    String name = "John";

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
		AddCutomerPageObjects.clickAddCustomer();
		AddCutomerPageObjects.enterName("John");
		
		
		

		WebElement AddCustomer = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6"));
		if (AddCustomer.isDisplayed()) {
			System.out.println("Customer Info Added  Successfully");
		} else {
			System.out.println("Test Case Failed");
		}
		
    }

	@AfterTest
    public void tearDown() {
        driver.quit();
    }
		
    }

		
		
		
		
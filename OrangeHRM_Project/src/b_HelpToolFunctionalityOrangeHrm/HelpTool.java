package b_HelpToolFunctionalityOrangeHrm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import g_Objects.HomePageObjects;
import g_Objects.LoginPageObejcts;

public class HelpTool {
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
        // Perform login
        loginPage.performLogin("Admin", "admin123");

		try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		HelpTool.click();
		
		try {
			Thread.sleep(3000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
		Set<String> windowTab = driver.getWindowHandles();
		if (windowTab.size() > 1) {
		    driver.switchTo().window(windowTab.iterator().next());
		    System.out.println("Help tool Tab opened successfully");
		} else {
		    System.out.println("Help tool Tab did not open successfully");
		}
    }

    private static void click() {
		}

	@AfterTest
    public void tearDown() {
        driver.quit();
    }
}

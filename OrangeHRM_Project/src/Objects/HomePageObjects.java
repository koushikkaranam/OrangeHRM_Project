package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
    private WebDriver driver;
    
   //------------------------HomePageObects---------------@Koushik-----

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")
	public static WebElement TimeModule;
    
    
    public static void clickTimeModule() {
        TimeModule.click();
    }
   
    
    
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/spann" ) 
    private WebElement Timecomponents;

    
    public String getsucessMessage2() {
        return Timecomponents.getText();
    }
    
    @FindBy(xpath = "//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[2]/nav/ul/div/button/i")
    private WebElement HelpTool;
    
    public void clicktool() {
        HelpTool.click();
   }
    

    
    @FindBy(xpath = "//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")
	public static WebElement TimeSheets;


      public static void clickTimesheet() {
       TimeSheets.click();
      }


	public boolean isMyRecordsDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}


	
   }




  


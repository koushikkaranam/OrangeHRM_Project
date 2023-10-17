package g_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeTimeSheetObjects {
    private WebDriver driver;
    
  //------------------------TimeSheetPageObects---------------@Koushik----- 

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a")
	public static WebElement EmployeeTimeSheet;
    
    public static void clickEmployeeTimeSheet() {
    	EmployeeTimeSheet.click();
    }
  
  
    
    @FindBy(xpath = "//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a")
	static WebElement EmployeeNameField;
    
    public static void EmployeeNameField(String name) {
    	EmployeeNameField.sendKeys(name);
    }
    
       @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")
    	public static WebElement View;
        
        public static void clickView() {
      	  View.click();
        }
      
      
      
}
package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimemodulePageObjects {
    private WebDriver driver;
    
  //------------------------TimeModulePageObects---------------@Koushik-----
    
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
	public static WebElement Attendence;


      public void clickAttendence() {
    	  Attendence.click();
      }
      
      
      @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")
  	public static WebElement Reports;


        public static void clickReports() {
      	  Reports.click();
        }
      
      @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")
     public static WebElement ProjectInfo;

            public static void clickProjectInfo() {
            	ProjectInfo.click();
            }
      
      
       @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")
        public static WebElement CustomerInfo;

          public static void clickCustomerInfo() {
        	  CustomerInfo.click();
                   }
  //------------------------------------------------------------    
          @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/button[1]/i")
          public static WebElement DeleteInfo;

            public static void clickDeleteInfo() {
          	  DeleteInfo.click();
               }
            
     //---------------------------------------------------------------------       
            
          
          
            @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/button[2]/i")
            public static WebElement EditCustomer;

              public static void clickEditCustomer() {
            	  EditCustomer.click();
                 }
          
          
          
          
   }
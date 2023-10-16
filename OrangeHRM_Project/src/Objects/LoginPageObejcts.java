package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObejcts {
    private WebDriver driver;

    
 //---------------@Koushik , these are the webElemts in login page.------------------   
    
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement usernameField;
    
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }
 //------------------------------------------------------

    @FindBy( xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement passwordField;
    
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
//--------------------------------------------------------------


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;
    
    public void clickLogin() {
        loginButton.click();
    }
//--------------------------------------------------------------

    
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p" ) 
    private WebElement errorMessageElement;
  
    
    public String getErrorMessage() {
        return errorMessageElement.getText();
    }
    
  //---------------------------------------------------------------------------------
   
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6") 
    private WebElement successMessageElement;

    public String getSuccessMessage() {
        return successMessageElement.getText();
    }
    
//----------------------------------------------------
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/spann" ) 
    private WebElement errorMessageElement2;

    
    public String getErrorMessage2() {
        return errorMessageElement2.getText();
    }
  //------------------------------------------------------
    public LoginPageObejcts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   
    public void performLogin(String username, String password) {
    enterUsername(username);
    enterPassword(password);
    clickLogin();}
	public void login(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}


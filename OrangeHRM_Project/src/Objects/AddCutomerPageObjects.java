package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCutomerPageObjects {
    private WebDriver driver;
    
    

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	public static WebElement AddCustomer;
    
    public static void clickAddCustomer() {
        AddCustomer.click();
    }
    
    //--------------------------------------------------
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	static
    WebElement NameField;
    
    public static void enterName(String name) {
        NameField.sendKeys(name);
    }

//----------------------------------------------------------




}

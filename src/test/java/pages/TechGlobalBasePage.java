package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import scripts.TechGlobalBase;
import utilities.Driver;

import java.util.List;

public class TechGlobalBasePage {

    public TechGlobalBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    TechGlobalBasePage techGlobalBasePage;

    //common elements from the header and footer

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(id = "dropdown-button")
    public WebElement headerDropDown;

    @FindBy(css = "dropdown-menu a")
    public List<WebElement> headerDropDownOptions;
}

package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TechGlobalBasePage;

public class TechGlobalLogoTest extends TechGlobalBase{


    @Test
    public void validateTechGlobalLogo(){
        //do your test here


        Assert.assertTrue(techGlobalBasePage.logo.isDisplayed()); //proper assertion with the testNG
    }


}

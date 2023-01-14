package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TechGlobalHeaderTest extends TechGlobalBase {


    @Test(priority = 1)
    public void validateTechGlobalHeaderDropDown() {
        //do your test here
        driver.get("https://techglobal-training.netlify.app/");

        WebElement header = driver.findElement(By.id("dropdown-button"));

        Assert.assertTrue(header.isDisplayed()); //proper assertion with the testNG
        Assert.assertEquals(header.getText(), "Practices");
    }

    @Test(priority = 2)
    public void validateTechGlobalHeaderDropDownOptions() {

        driver.findElement(By.id("dropdown-button")).click();

        List<WebElement> headerItems = driver.findElements(By.cssSelector("#dropdown-menu a"));
        String[] headerOptions = {"Frontend Testing", "Backend Testing", "Java Exercises"};

        for (int i = 0; i < headerItems.size(); i++) {
            Assert.assertTrue(headerItems.get(i).isDisplayed());
            Assert.assertTrue(headerItems.get(i).isEnabled());
            Assert.assertEquals(headerItems.get(i).getText(), headerOptions[i]);
        }

      /*  for (WebElement headerItem : headerItems) {
            int i = 0;
            System.out.println(headerItem.isDisplayed());
            System.out.println(headerItem.isEnabled());
            System.out.println(headerItem.getText(), headerOptions[i++]);
        }
    }

       */
    }
}


/*

        Assert.assertTrue(frontend.isDisplayed());
        Assert.assertTrue(frontend.isEnabled());
        Assert.assertEquals(frontend.getText(), "Frontend Testing");

 */



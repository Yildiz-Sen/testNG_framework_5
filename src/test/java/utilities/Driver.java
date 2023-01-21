package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){
        if(driver == null){
           // WebDriverManager.chromedriver().setup();
         //   driver = new ChromeDriver();

            WebDriverManager.getInstance(SafariDriver.class);
            driver = new SafariDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }


    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }

}

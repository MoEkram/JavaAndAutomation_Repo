package c_TestNG;

// Assertions used inside @Test to determine pass/fail test

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Assertions {

    ChromeDriver driver;

    @BeforeTest
    public void initialization (){
        String driverKey = "webdriver.chrome.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\chromedriver_92.0.4515.43.exe";
        System.setProperty(driverKey,driverPath);
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void openURL (){       // always give a name as verb
        // navigate to URL
        driver.navigate().to("https://www.google.com");
    }

    @Test ( dependsOnMethods = {"openURL"})
    public void getTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Google2");

    }

    @AfterTest
    public void closure(){
        driver.quit();
    }
}

package d_Selenium_DeepDive;

// Browsers provide navigation methods include
//      - open web page from browser history
//      - refreshing the current page with ( back(), forward(), refresh(), to(String url), to(java.net.URL url )  )
//      - Maximize a browser window ( maximize() )    //driver.manage().window().maximize()

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class b_Browser_Navigation {

    ChromeDriver driver;


    @BeforeTest
    public void initialization (){
        String driverKey = "webdriver.chrome.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\chromedriver_92.0.4515.43.exe";
        System.setProperty(driverKey,driverPath);

        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void browserNavigation (){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().fullscreen();

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());

    }

    @AfterTest
    public void closure(){
        driver.quit();
    }

}

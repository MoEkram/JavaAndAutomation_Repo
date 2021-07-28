package a_FirstTimeScripting;
//This is the first step in Selenium scripting

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
    public static void main(String[] args) {

        // For ChromeDriver or FireFoxDriver, remember to download exe file for chrome drive (driver executable), and add it to system properties
        // Firefox: https://github.com/mozilla/geckodriver/releases/tags > choose any version ex: 0.29.1 > choose geckodriver-v0.29.1-win32
        // the following will add Firefox Driver executable file in the system properties

        System.setProperty("webdriver.gecko.driver",          // key for the exe file
                "D:\\Automation\\firefoxdriver_geckodriver-v0.29.1-win32\\geckodriver_0.29.1.exe");    // path of exe file include file name with .exe ( remove // , just one / )

        // In case your Fixefox is not installed in the default path
        System.setProperty("webdriver.firefox.bin",          // key for the exe file
                "C:\\Users\\mabdulhalim.c\\AppData\\Local\\Mozilla Firefox\\firefox.exe");    // path of exe file include file name with .exe ( remove // , just one / )

        // For WebDriver, always choose WebDriver from inside ( org.openqa.selenium )

        WebDriver driver = new FirefoxDriver();

        //Open the URL that contains the project

        driver.navigate().to("https://www.google.com/");   // remember to add https://

        // Close the driver
        driver.quit();

    }
}

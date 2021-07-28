package b_MavenScripting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo2 {
    public static void main(String[] args) {

        // If you use Maven, no need to add TestNG libraries, no need to refer to external folder for chrome drive (driver executable).

        // In case your Fixefox is not installed in the default path
        System.setProperty("webdriver.firefox.bin",          // key for the exe file
                "C:\\Users\\mabdulhalim.c\\AppData\\Local\\Mozilla Firefox\\firefox.exe");    // path of exe file include file name with .exe ( remove // , just one / )

        //getProperty will get the path of current project
        String driverKey = "webdriver.gecko.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\geckodriver_0.29.1.exe";

        System.setProperty(driverKey,driverPath);

        // For WebDriver, always choose WebDriver from inside ( org.openqa.selenium )

        WebDriver driver = new FirefoxDriver();

        //Open the URL that contains the project

        driver.navigate().to("https://www.google.com/");   // remember to add https://

        // Close the driver
        driver.quit();
    }
}

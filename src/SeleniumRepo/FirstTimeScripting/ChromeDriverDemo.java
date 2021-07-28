package FirstTimeScripting;
//This is the first step in Selenium scripting

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {
    public static void main(String[] args) {

        // For ChromeDriver or FireFoxDriver, remember to download exe file for chrome drive (driver executable), and add it to system properties
        // Chrome: http://chromedriver.storage.googleapis.com/index.html > choose any version ex: 2.31 > chose chromedriver_win32
        // the following will add Chrome Driver executable file in the system properties

        System.setProperty("webdriver.chrome.driver",          // key for the exe file
                "D:\\Automation\\chromedriver_win32_92.0.4515.43\\chromedriver.exe");    // path of exe file include file name with .exe ( remove // , just one / )


        // For WebDriver, always choose WebDriver from inside ( org.openqa.selenium )

        WebDriver driver = new ChromeDriver();

        //Open the URL that contains the project

        driver.navigate().to("https://www.google.com/");   // remember to add https://

        // Close the driver
        driver.quit();

    }
}

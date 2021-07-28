package b_MavenScripting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo2 {

    public static void main(String[] args) {

        // If you use Maven, no need to add TestNG libraries, no need to refer to external folder for chrome drive (driver executable).

        //getProperty will get the path of current project
        String driverKey = "webdriver.chrome.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\chromedriver_92.0.4515.43.exe";

        System.setProperty(driverKey,driverPath);

        // For WebDriver, always choose WebDriver from inside ( org.openqa.selenium )

        WebDriver driver = new ChromeDriver();

        //Open the URL that contains the project

        driver.navigate().to("https://www.google.com/");   // remember to add https://

        // Close the driver
        driver.quit();
    }
}

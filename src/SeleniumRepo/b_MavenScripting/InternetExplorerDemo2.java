package b_MavenScripting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo2 {

    public static void main(String[] args) {

        // If you use Maven, no need to add TestNG libraries, no need to refer to external folder for chrome drive (driver executable).


        //getProperty will get the path of current project
        String driverKey = "webdriver.ie.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\IEDriverServer_Win32_3.9.0.exe";

        // Remember to enable protected mode in internet options > security > Internet & Local internet & Trusted sites & restricted sites

        System.setProperty(driverKey,driverPath);

        // For WebDriver, always choose WebDriver from inside ( org.openqa.selenium )

        WebDriver driver = new InternetExplorerDriver();

        //Open the URL that contains the project

        driver.navigate().to("https://www.google.com/");   // remember to add https://

        // Close the driver
        driver.quit();
    }

}

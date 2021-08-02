package d_Selenium_DeepDive;

// WebDriver provides methods to simulate keyboard entry into textBoxes or text areas and perform clicks on a button control. ex: element.clear();
//              ex: clear() , sendKeys(), submit() and click ()
// WebElements :
//                  -

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c_WorkingWithElements {
    ChromeDriver driver;

    @BeforeTest
    public void initialization (){
        String driverKey = "webdriver.chrome.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\chromedriver_92.0.4515.43.exe";
        System.setProperty(driverKey,driverPath);

        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void openURL (){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement usernameTxt = driver.findElement(By.id("username"));
        usernameTxt.sendKeys("Mohamed Ekram");
        System.out.println(usernameTxt.getText());
    }

    @AfterTest
    public void closure(){
       driver.quit();
    }

}

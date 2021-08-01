package d_Selenium_DeepDive;

// Most of web pages are created in HTML, CC, JavaScript & Images, the browser compile the code and hiding the code and display the UI elements to the users
// we need to understand ( Document Object Model - DOM ) and the basics for how javaScript or AJAX calls made from the application, to be able to find these UI elements.
// How to inspect element ?
//              - Google Chrome : right click on the page > inspect > developer too will be opened > doc the panel down to be easy to see it
//                                from top left side in the panel, click on mose icon called ( Select an element in the page to inspect it )
//                                > click on any UI element
//                                > choose any attribute and check its value
//              - Mozilla Firefox using the dev. tool
//              - Internet explorer
// Selectors / Locators : you can right click on any line of code in inspect element >> choose copy > drop down will be displayed with following:

// locators ( attributes ) in Selenium WebDriver ( ordered in priority )
//              <the best>  - ID            driver.findElement( By.id( < element ID > ) )
//                          - Name          driver.findElement( By.name( < element name > ) )
//                          - Class name    driver.findElement( By.className( < element class > ) )
//                          - Tag name      driver.findElement( By.tagName( < html tag name > ) )     ex: <a class ...
//                          - Link text     driver.findElement( By.linkText( < link text > ) )   ex: the label ( text ) displayed for hyperlink
//                          - Partial Link  driver.findElement( By.partialLinkText( < link text > ) )   ex: part of the label ( text ) displayed for hyperlink
//                          - CSS           driver.findElement( By.cssSelector( < css selector > ) )
//                          - XPath         driver.findElement( By.xpath( < xpath query expression > ) )  ex: //*[@id="password"]

//                          - Inner HTML
//                          - Outer HTML
//                          - CSS Selector
//                          - CSS Path

// if you have more than one attribute with same value, webDriver will take the first one.

//  In Selenium webDriver we have
//               - findElement () : return one instance of a webElement found in page DOM, according to entered locator
//                                  If no element found, NoSuchElementFound exception will be returned
//               - findElements() : return a list of WebElements, all theses elements has same search criteria, ex: all of them has same Class name
//                                  You want to get all table rows and make a loop on it, or check the domain of all URLs in the page
//                                  no exception will be returned if no elements found, it will return empty list


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class a_FindingElements {

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
    }

    @Test ( dependsOnMethods = {"openURL"})
    public void findElement(){
        try {
            WebElement usernameTxt = driver.findElement(By.id("username"));         // By ID
            WebElement passwordTxt = driver.findElement(By.name("password"));       // By password
            WebElement loginBtn = driver.findElement(By.className("radius"));       // By ClassName

            System.out.println("By name = " + usernameTxt.getTagName());
            System.out.println("By password = " + passwordTxt.getTagName());
            System.out.println("By ClassName = " + loginBtn.getText());

        } catch (NoSuchElementException e){
            System.out.println("The element is not found, use anther attribute");
        }

    }

    @Test (priority = 2, dependsOnMethods = {"openURL"})
    public void findElementByTagName(){
        try {
            WebElement loginBtn = driver.findElement(By.tagName("button"));       // By tagName, ex: <button class="radius" ...

            System.out.println("By tagName = " + loginBtn.getText());

        } catch (NoSuchElementException e){
            System.out.println("The element is not found, use anther attribute");
        }

    }

    @Test (priority = 4)
    public void findElementByTag(){
        try {

            driver.navigate().to("https://the-internet.herokuapp.com/tables");
            WebElement tableElm = driver.findElement(By.id("table1"));       // First find the whole table...

            List<WebElement> rows = tableElm.findElements(By.tagName("tr"));  //

            System.out.println("table size = " + rows.size());
            System.out.println("row number 3 = " + rows.get(3).getText());

        } catch (NoSuchElementException e){
            System.out.println("The element is not found, use anther attribute");
        }

    }

    @Test (priority = 3)
    public void findElementByCssSelector(){
        try {

            WebElement loginCSSbtn = driver.findElement(By.cssSelector("button.radius"));       // By ByCssSelector, name of the element.class name ex: <button class="radius" type="submit">

            System.out.println("button name in CSS = " + loginCSSbtn.getText());

        } catch (NoSuchElementException e){
            System.out.println("The element is not found, use anther attribute");
        }

    }



    @Test (priority = 5)
    public void findMultipleElements(){
        try {

            driver.navigate().to("https://the-internet.herokuapp.com/");

            List<WebElement> allURLs = driver.findElements(By.tagName("a"));     //list of webeLements , no exception will be displayed with findElements, it will return empty list,

            System.out.println("Number of URLs in the page = " + allURLs.size());

            Assert.assertEquals(46,allURLs.size());

            for (WebElement eachURL : allURLs){
                System.out.println(eachURL.getAttribute("href"));  //get all URLs in the page
            }

        } catch (NoSuchElementException e){
            System.out.println("The element is not found, use anther attribute");
        }

    }

    @AfterTest
    public void closure(){
        driver.quit();
    }

}

package c_TestNG;

//TestNG = It is Test Runner
//         It is testing framework, with more features than JUnit and Nunit, used to execute Unit test cases & automated TCs
//         has annotations to simple use and more flexible test execute
//         Test configuration flexible
//         TestNG an generate reports bases on test result, as Webdriver don't have reports.
//         Annotations:
//                          - easy to understand / you can group TCs / you can do parallel testing / pass extra parameters
//         Annotations:
//                          - @Test : on any class or method, testNG will consider it as a test cases

//                          - @BeforeMethod : Run this method before any @Test methods
//                          - @BeforeTest :
//                          - @BeforeClass : execute once before the first test method in current class
//                          - @BeforeGroups : It sets up the method to run before the first test method belonging to any of the groups involved in the execution
//                          - @BeforeSuite : Any such method will get called before any of the suites runs from the test.

//                          - @AfterMethod : Run this method after any @Test methods
//                          - @AfterTest :
//                          - @AfterClass : execute once After finishing all test methods in current class
//                          - @AfterGroups : It sets up the method to run after the execution of all the test methods belonging to any of the groups involved in the execution
//                          - @BeforeSuite : Any such method will get called after execute all other methods in the current test suite

//                          - @Parameters : to pass parameters to test methods
//                          - @DataProvider : marks a method as data source for the test
//                          - Factory : You use it to execute any specific group of test cases with varied values, its returns an array of test class objects as the <object>
//                          - Listeners : You can use them with the test classes for the logging function

// To enable the TestNG default report (HTML report), Open Run > Edit configuration > Listeners > check beside ( Use default reporters )
// Then run your test, and check the result in the generated folder ( test-output ) > index.html

// Parameters  :
//                  - Priority = 1 : to order the tests and execute them in different order, by assigning a number to it.
//                               If no priority is assigned, execution will be per the alphabetical order of the tests
//                               ex: @test(Priority = 1 )
//                  - Enable = false : disable test cases, which is not ready or you don't want to run it
//                  - dependsOnMethods = { "method_name" } : when you want piece of code to be executed only if a method executed successfully
//                                       this takes array of strings, the not run testcases will be called ( Skipped )
//                  - alwaysRun = true : method will be executed irrespective of the fail/pass condition of the depending method.
//                  - groups = { "SmokeTest" }:  you have number of methods ( ex: 100 TC ) but you want to run only 20 test case,
//                                just assign group name to a number of test cases, then choose to execute the group instead the entire code
//                                remember to add beforeTest and afterTest in your group.
//                                from the xml, after Test tag,    <groups> <run>
//                                                                 <include name="SmokeTest"></include>
//                                                                 </run>  </groups>
//                  - dependsOnGroup = { "SmokeTest" } : Run it only if SmokeTest group is pass

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// You can delete test-output folder, it will be generated every time you run your test
// xml file is created automatically for the default test suite, contains your tests
// you can create your own xml, check TestNG.xml, right click on it and run

public class TestNG_Annotations {

    // Declaration of the driver to be outside all method
    ChromeDriver driver;

    @BeforeTest (groups = {"SmokeTest"})                     // this will run for one time, and will not be counted in the number of tests
    public void initialization() {
        // set System property with the path of Chrome webDriver
        String driverKey = "webdriver.chrome.driver";
        String driverPath = System.getProperty("user.dir")+"\\resources\\chromedriver_92.0.4515.43.exe";
        System.setProperty(driverKey,driverPath);

        // Initialize the driver
        driver = new ChromeDriver();
    }

    @Test (priority = 2, alwaysRun = true, enabled = true, groups = {"SmokeTest"})
    public void openURL (){       // always give a name as verb
        // navigate to URL
        driver.navigate().to("https://www.google.com");
        System.out.println("This is openURL");
    }


    @Test (priority = 1, enabled = true)
    public void printInfo (){
        System.out.println("This is printInfo");
        System.out.println("get currentURL : " + driver.getCurrentUrl());   //getCurrentUrl one of driver methods
        System.out.println("get title : " + driver.getTitle());   //getTitle get the title displayed in the tab of the browser
    }


    @Test (priority = 3, enabled = false)
    public void testEnableParameter (){
        System.out.println("This will not be printed");
    }

    @Test (priority = 4, enabled = true, dependsOnMethods ={"openURL"})
    public void testDependsOnMethods (){
        driver.navigate().to("https://news.google.com");
    }


    @AfterTest (groups = {"SmokeTest"})    // this will run for one time, and will not be counted in the number of tests
    public void closure (){
        // close the connection with the driver
        driver.quit();
    }

}
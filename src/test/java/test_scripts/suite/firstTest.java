package test_scripts.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class firstTest {
    WebDriver driver;

    @BeforeTest
    void beforeTest(){
        System.out.println("Start first test case");
    }

    @AfterTest
    void afterTest(){
        System.out.println("First test case finished");
    }

    @Test
    void firstTest(){
        System.out.println("MY FIRST TEST CASE");
    }

    @Test
    void secondTest(){
        System.out.println("MY SECOND TEST CASE");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        System.out.println("Starting Test On Chrome Browser");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        driver.quit();
        System.out.println("Finished Test On Chrome Browser");
    }
}

package Domaci_21_01_2022.base;

import Domaci_21_01_2022.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage1 {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        homePage = new HomePage(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//        driver.quit();
    }


}

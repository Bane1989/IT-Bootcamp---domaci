package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ZadatakDemoQA {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacic1 = new Cookie("userName", "bane");
        driver.manage().addCookie(kolacic1);

        Cookie kolacic2 = new Cookie("userID", "d16e505c-2d7d-485d-9598-7078e480d1b4");
        driver.manage().addCookie(kolacic2);

        Cookie kolacic3 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImJhbmUiLCJwYXNzd29yZCI6" +
                "IkJyYW5rbzE5ODkhIiwiaWF0IjoxNjQyMzQ0NjkyfQ.vokXhEyZ25v9lnX1dNx-_gAAGAumcQQIuIA-xs3YqYg");
        driver.manage().addCookie(kolacic3);

        Cookie kolacic4 = new Cookie("expires", "2022-01-23T14%3A51%3A32.013Z");
        driver.manage().addCookie(kolacic4);

        driver.navigate().refresh();
//
        WebElement logOutButton = driver.findElement(By.id("submit"));
        logOutButton.click();

        Assert.assertTrue(logOutButton.isDisplayed());
    }
}

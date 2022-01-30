package Selenium;

import com.sun.jna.Structure;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DomaciZadatak18_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com");

        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("Never Gonna Give You Up");

        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("search-icon-legacy")));
        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Rick Astley - Never Gonna Give You Up (Official Music Video)\n")));
        WebElement link = driver.findElement(By.partialLinkText("Rick Astley - Never Gonna Give You Up (Official Music Video)\n"));
        link.click();

    }
}

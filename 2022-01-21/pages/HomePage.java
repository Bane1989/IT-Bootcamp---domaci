package Domaci_21_01_2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    List<WebElement> categories;
    List<WebElement> items;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getCategories() {
        return driver.findElements(By.id("itemc"));
    }

    public List<WebElement> getItems() {
        return driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
    }

    //    -------------------------------------------------------------------

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (WebElement we : getItems()) {
            sb.append("Naziv: ");
            sb.append(we.findElement(By.className("hrefch")).getText());
            sb.append("\n");
            sb.append("Opis: ");
            sb.append(we.findElement(By.id("article")).getText());
            sb.append("\n");
            sb.append("Cena: ");
            sb.append(we.findElement(By.tagName("h5")).getText());
            sb.append("\n");
            sb.append("\n");
        }

        return sb.toString();
    }

    public int totalItems() {
        return getItems().size();
    }

    public int totalPrice() {
        int sum = 0;
        for (WebElement we : getItems()) {
            sum += Integer.parseInt(we.findElement(By.tagName("h5")).getText().substring(1));
        }
        return sum;
    }

}

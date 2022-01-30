package Domaci_21_01_2022.test;

import Domaci_21_01_2022.base.BasePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test1 extends BasePage1 {

    @BeforeMethod
    public void setUpPage() {
        driver.navigate().to("https://www.demoblaze.com/index.html#");
        driver.manage().window().maximize();
    }

    @Test(priority = 10)
    public void testHomePage() throws InterruptedException {

        Thread.sleep(2000);
        for (WebElement wb : homePage.getCategories()) {
            wb.click();
            System.out.println("**********************************************");
            System.out.println(wb.getText());
            System.out.println("------------------------------------------------");
            Thread.sleep(2000);
            System.out.print(homePage);
            System.out.println("------------------------------------------------");
            System.out.println("Ukupno stavki iz " + wb.getText() + " = " + homePage.totalItems());
            System.out.println("------------------------------------------------");
            System.out.println("Ukupna cena svih proizvoda iz " + wb.getText() + " = " + homePage.totalPrice() +"\n");
        }
    }

    @Test(priority = 20)
    public void addFirstItem() throws InterruptedException {

        homePage.getCategories().get(0).click();

        Thread.sleep(2000);

            homePage.getItems().get(1).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
    }

    @Test(priority = 30)
    public void addSecondItem() throws InterruptedException {

        homePage.getCategories().get(1).click();

        Thread.sleep(2000);

            homePage.getItems().get(1).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
    }

    @Test(priority = 40)
    public void addThirdItem() throws InterruptedException {

        homePage.getCategories().get(2).click();

        Thread.sleep(2000);

            homePage.getItems().get(1).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
    }

    @Test(priority = 50)
    public void testCart() throws InterruptedException {
        WebElement cartLink = driver.findElement(By.id("cartur"));
        cartLink.click();

        Thread.sleep(2000);
        List<WebElement> success = driver.findElements(By.className("success"));

        int expectedSize = 3;
        Assert.assertEquals(success.size(), expectedSize);
    }
}

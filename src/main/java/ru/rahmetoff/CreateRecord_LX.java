package ru.rahmetoff;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static ru.rahmetoff.Log_in.driver;

public class CreateRecord_LX {

    public static void main(String[] args) {
        Log_in log_in = new Log_in();
        log_in.login();

        WebDriverWait driverWait5s = new WebDriverWait(driver, 5);

        driverWait5s.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.cssSelector(".i-menu-newpost"))));
        driver.findElement(By.cssSelector(".i-menu-newpost")).click();

        driverWait5s.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("postTitle"))));
        WebElement recordTitle = driver.findElement(By.id("postTitle"));
        String title = "Тестовая запись #" + RandomStringUtils.randomAlphabetic(8);
        recordTitle.sendKeys(title);

        driverWait5s.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.id("message"))));

        WebElement recordMessage = driver.findElement(By.id("message"));
        recordMessage.sendKeys("тест тест тест"
                + RandomStringUtils.randomAlphabetic(52));

        driverWait5s.until(ExpectedConditions.visibilityOf(driver
                .findElement(By.id("rewrite"))));
        driver.findElement(By.id("rewrite")).click();

        driverWait5s.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='title']")));
        List<WebElement> records = driver.findElements(By.xpath("//a[@class='title']"));

        boolean result = false;
        for(WebElement record:records){
            if (record.getText().equals(title)){
                result = true;
                break;
            }
        }

        if (result){
            System.out.println("Record OK");
        } else {
            System.out.println("Record false");
        }

        driver.quit();
    }

}

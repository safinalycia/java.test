package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.yandex.ru/");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[1]/div[1]/button")).click();
        WebElement loginForm = driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]"));
        loginForm.sendKeys("sashev.1978");
        driver.findElement(By.xpath("//*[@id=\"passp:sign-in\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]")).sendKeys("171819rai");
        driver.findElement(By.xpath("//*[@id=\"passp:sign-in\"]")).click();

    }
}

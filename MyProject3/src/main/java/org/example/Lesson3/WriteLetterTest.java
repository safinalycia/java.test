package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteLetterTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.yandex.ru/");
        Cookie cookie = new Cookie("Session_id", "3:1674815361.5.0.1674815361092:A2U0sA:26.1.2:1|1747694677.0.2|3:10264703.346606.iZPZmVYyJvAgipBrYOrN2GOVdqM");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[7]/div/div[3]/div/nav/div[2]/div/div/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"compose-field-1\"]")).sendKeys("safinalycia@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"compose-field-subject-4\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/div")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"js-apps-container\"]/div[2]/div[10]/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/button")).click();

        Thread.sleep(3000);
        driver.quit();
    }



}

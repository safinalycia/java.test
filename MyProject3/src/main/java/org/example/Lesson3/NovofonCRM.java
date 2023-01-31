package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NovofonCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://novofon.com");
        Cookie cookie = new Cookie("token","MzFkOGZlNjAzNWQxODliNTU3YzRiMmYzMTkzNDJjNzl8ZjI1Mzk4Mzk5YjZlMDgwMmYyODQ2MmMzMzY3NTY4MzE=");
driver.manage().addCookie(cookie);
driver.navigate().refresh();

driver.findElement(By.xpath("//*[@id=\"app\"]/div/nav/div[2]/div/div[1]/div[1]/a[6]")).click();
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[1]/div[2]/button/svg/path")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[8]/div/form/div[2]/div[2]/div/input")).sendKeys("Тест");
driver.findElement(By.xpath("//*[@id=\"richeditor\"]/div[1]")).sendKeys("test");
driver.findElement(By.xpath("/html/body/div[8]/div/form/div[3]/div/div/button[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div")).click();
Thread.sleep(5000);
driver.quit();
    }
}

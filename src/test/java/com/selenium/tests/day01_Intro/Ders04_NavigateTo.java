package com.selenium.tests.day01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders04_NavigateTo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2);

        driver.navigate().to("https://youtube.com");
        Thread.sleep(2);

        driver.navigate().back();
        Thread.sleep(2);

        driver.navigate().forward();
        Thread.sleep(2);

        driver.navigate().refresh();
        Thread.sleep(2);
        driver.close();
    }
}

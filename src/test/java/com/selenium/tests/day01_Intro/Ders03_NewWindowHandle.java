package com.selenium.tests.day01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Ders03_NewWindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        ((JavascriptExecutor) driver).executeScript("window.open()");//yeni pencere açar

        String currentId = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String id : allWindows) {
            if (id!= currentId) {
                driver.switchTo().window(id);
            }
        }
        driver.get("https:youtube.com");
        driver.close();

        driver.switchTo().window(currentId);
        driver.get("https:youtube.com");

        driver.close();

    }
}

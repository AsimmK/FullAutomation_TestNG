package com.selenium.tests.day01_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders01_OpenBrowser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        ((JavascriptExecutor)driver).executeScript("windows.open()");//Yeni pencere açar
        driver.get("https://youtube.com");//Yeni pencere açılsa da aktif olan pencere değişmez
        driver.quit();//Tüm pencereler kapanır
        driver.close();//Aktif olan pencere kapanır
    }
}

package com.selenium.tests.day04;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders11_RelativeXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com.tr/");

        //a[@class='nav-a nav-a-2 nav-progressive-attribute'][1]

        WebElement girisButonu = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute'][1]"));

        girisButonu.click();
    }
}

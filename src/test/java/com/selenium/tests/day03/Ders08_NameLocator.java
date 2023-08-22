package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders08_NameLocator {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://devbook.bootflow.academy/login");

        WebElement understandBtn = driver.findElement(By.id("rcc-confirm-button"));
        understandBtn.click();

        WebElement email_textBox = driver.findElement(By.cssSelector("input[name=email]"));
        email_textBox.sendKeys("falanca@gmail.com");

        WebElement password_textBox = driver.findElement(By.name("password"));
        String placeholderOfPassword = password_textBox.getAttribute("placeholder");
        System.out.println("placeholderOfPassword = " + placeholderOfPassword);

        driver.close();


    }
}

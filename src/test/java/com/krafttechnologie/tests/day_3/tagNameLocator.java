package com.krafttechnologie.tests.day_3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement emailInputBox= driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@gmail.com");
        WebElement passwordInputBox= driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("12345");

        //2. yol
        // driver.findElement(By.name("password")).sendKeys("12345");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();
        Thread.sleep(2000);


        driver.findElement(By.tagName("h1")).getTagName();


        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.tagName("H3"));
        driver.close();
    }
}

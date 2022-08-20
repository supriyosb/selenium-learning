package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private static final String USERNAME = "userName";
    private static final String PASSWORD = "//input[@name='password']";
    private static final String SUBMIT = "//input[@name='submit']";

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void login(String userName, String password){
        WebElement elementUsername = driver.findElement(By.name(USERNAME));
        elementUsername.sendKeys(userName);

        WebElement elementPassword = driver.findElement(By.xpath(PASSWORD));
        elementPassword.sendKeys(password);

        WebElement elementSubmit = driver.findElement(By.xpath(SUBMIT));
        elementSubmit.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

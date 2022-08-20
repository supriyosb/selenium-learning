package com.learning.base;

import com.learning.pages.FlightsPage;
import com.learning.pages.HomePage;
import com.learning.pages.HotelsPage;
import com.learning.pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public WebDriver driver;

    public HomePage homePage;
    public RegisterPage registerPage;
    public FlightsPage flightsPage;
    public HotelsPage hotelsPage;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        flightsPage = new FlightsPage(driver);
        hotelsPage = new HotelsPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

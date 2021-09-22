package com.moneygaming.tests;

import com.github.javafaker.Faker;
import com.moneygaming.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    //we made our driver object global variable
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
    //open me a chrome driver
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    // get the page
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }

    @Test
        public void test1() throws InterruptedException {

        WebElement nameBox=driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surName= driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surName.sendKeys("Smith");
        Thread.sleep(2000);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {

        driver.quit();

    }
}

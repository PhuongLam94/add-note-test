package com.pl.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    @BeforeEach
    public void before(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
    }
}

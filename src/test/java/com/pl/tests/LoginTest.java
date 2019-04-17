package com.pl.tests;

import com.pl.data.Constant;
import com.pl.pages.HomePage;
import com.pl.pages.LoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest{


    @Test
    public void loginSuccessfully(){
        HomePage homePage = new HomePage(driver);
        homePage.goToPage();
        homePage.clickLoginBtn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(Constant.DEFAULT_USERNAME, Constant.DEFAULT_PASSWORD);
    }
}

package com.pl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
        title = "http://testapp.galenframework.com";
    }

    @FindBy(css = "button.button-login[onclick='App.showLoginPage();']")
    private WebElement loginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }
}

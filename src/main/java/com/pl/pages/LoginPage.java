package com.pl.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(name = "login.username")
    private WebElement usernameTxtFld;

    @FindBy(name = "login.password")
    private WebElement passwordTxtFld;

    @FindBy(css = "button.button-login[onclick='App.login()']")
    private WebElement loginBtn;

    public void login(String username, String password){
        usernameTxtFld.sendKeys(username);
        passwordTxtFld.sendKeys(password);
        loginBtn.click();
    }
}

package com.pl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyNotePage extends BasePage {
    public MyNotePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='App.showAddNotePage();']")
    private WebElement addNoteBtn;

    public void clickAddNoteBtn(){
        addNoteBtn.click();
    }
}

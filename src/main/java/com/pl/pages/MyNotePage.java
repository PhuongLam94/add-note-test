package com.pl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MyNotePage extends BasePage {
    public MyNotePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='App.showAddNotePage();']")
    private WebElement addNoteBtn;

    @FindBy(css = "div#my-notes-page h2")
    private WebElement titleTxt;

    @FindBy(className = "list-group-item-heading")
    private List<WebElement> lstGroupItemHead;

    @FindBy(className = "list-group-item-text")
    private List<WebElement> lstGroupItemText;

    public void clickAddNoteBtn(){
        addNoteBtn.click();
    }
    public  String getTitle(){
        return titleTxt.getText();
    }
}

package com.pl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNotePage extends BasePage {
    public AddNotePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "note.title")
    private WebElement noteTitleTxtFld;

    @FindBy(name = "note.description")
    private WebElement noteDescTxtFld;

    @FindBy(css = "button[onclick='App.addNote()']")
    private WebElement addNoteBtn;

    public void createNote(String title, String description){
        noteTitleTxtFld.sendKeys(title);
        noteDescTxtFld.sendKeys(description);
        addNoteBtn.click();
    }
}

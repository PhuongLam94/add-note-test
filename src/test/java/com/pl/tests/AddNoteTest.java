package com.pl.tests;

import com.pl.com.pl.utils.RandomUtils;
import com.pl.data.Constant;
import com.pl.pages.AddNotePage;
import com.pl.pages.HomePage;
import com.pl.pages.LoginPage;
import com.pl.pages.MyNotePage;
import org.junit.jupiter.api.Test;

public class AddNoteTest extends BaseTest {
    @Test
    public void addNoteSuccessfully(){
        HomePage homePage = new HomePage(driver);
        homePage.goToPage();

        homePage.clickLoginBtn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(Constant.DEFAULT_USERNAME, Constant.DEFAULT_PASSWORD);

        MyNotePage myNotePage = new MyNotePage(driver);
        myNotePage.clickAddNoteBtn();

        AddNotePage addNotePage = new AddNotePage(driver);
        addNotePage.createNote(RandomUtils.getRandomString("Note title "),
                RandomUtils.getRandomString("Note description "));
    }
}

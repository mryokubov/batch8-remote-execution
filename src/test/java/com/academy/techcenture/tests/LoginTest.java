package com.academy.techcenture.tests;

import com.academy.techcenture.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginPositiveTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.login();
    }

    @Test
    public void loginNegativeTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.loginNegative();
    }
}

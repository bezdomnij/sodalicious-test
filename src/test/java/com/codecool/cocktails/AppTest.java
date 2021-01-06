package com.codecool.cocktails;

import static org.junit.Assert.assertTrue;

import com.codecool.cocktails.pages.LoginPage;
import com.codecool.cocktails.pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class AppTest 
{
    static LoginPage loginPage = new LoginPage();
    static MainPage mainPage = new MainPage();

    @Test
    public void testLogin(){
        WebElement element = loginPage.login();
        //Assertions.assertNotNull(element);
        WebElement logout = mainPage.getLogout();
        Assertions.assertNotNull(logout);
    }

}

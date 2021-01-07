package com.codecool.cocktails;


import com.codecool.cocktails.pages.LoginPage;
import com.codecool.cocktails.pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class AppTest 
{
    static LoginPage loginPage = new LoginPage();
    static MainPage mainPage = new MainPage();

    @ParameterizedTest
    @CsvSource({"d@d.com, d", "c@c.com, c"})
    @Test
    public void testLogin(String emailAddress, String password) {
        loginPage.login(emailAddress, password);
        Assertions.assertNotNull(mainPage.getLogout());
        Assertions.assertEquals(emailAddress, mainPage.getUserName());
        mainPage.logOut();
    }

}

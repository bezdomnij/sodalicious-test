package com.codecool.cocktails.util;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    public static WebDriver instance = null;

    private WebDriverSingleton() { }

    public static WebDriver getInstance(){
        if (instance == null){
            //ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
            FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            //instance = new ChromeDriver();
            instance = new FirefoxDriver();
            //instance.get("https://jira.codecool.codecanvas.hu/secure/Dashboard.jspa");
            //instance.get("http://localhost:3000/");
        }
        return instance;
    }
}

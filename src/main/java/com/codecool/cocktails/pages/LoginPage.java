package com.codecool.cocktails.pages;

import com.codecool.cocktails.util.WebDriverSingleton;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @FindBy(xpath = "//div/input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//div/input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//div[contains(text(),'Log in')]")
    private WebElement submit;

    public LoginPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void login(String emailAddress, String password){
        driver.get("http://localhost:3000/login");
        driver.manage().window().maximize();
        userName.sendKeys(emailAddress);
        this.password.sendKeys(password);
        submit.click();
    }
}

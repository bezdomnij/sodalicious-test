package com.codecool.cocktails.pages;

import com.codecool.cocktails.util.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    public MainPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logout;

    @FindBy(xpath = "//p[@class='logged-in-text']")
    private WebElement userName;

    public WebElement getLogout() {
        return logout;
    }

    public String getUserName(){
        String text = userName.getText();
        return text.replace("You are logged in as: ", "");
    }

    public void logOut(){
        logout.click();
    }
}

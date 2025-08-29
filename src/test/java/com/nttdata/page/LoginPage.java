package com.nttdata.page;

import org.openqa.selenium.By;
import com.nttdata.core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    //Localizadores de elementos
    private WebDriver driver;

    public static By iniciolabel = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a");
    public static By usernameInput = By.id("field-email");
    public static By passwordInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By errorMessage = By.cssSelector("li[class*='alert']");

    public LoginPage(){
        this.driver = DriverManager.getDriver();
    }




    public boolean isErrorDisplayed(){
        return driver.findElements(errorMessage).size() > 0;
    }
}

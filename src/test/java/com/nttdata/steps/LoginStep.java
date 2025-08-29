package com.nttdata.steps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.page.LoginPage.*;
import static org.junit.Assert.assertTrue;

public class LoginStep {
    private WebDriver driver;
    public LoginStep(WebDriver driver){
        this.driver = driver;
    }
   // LoginPage loginPage = new LoginPage();


    public void login(String user, String pass){
        driver.findElement(iniciolabel).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(user);
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(pass);
        driver.findElement(loginButton).click();
    }


}

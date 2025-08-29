package com.nttdata.page;

import org.openqa.selenium.By;


public class LoginPage {

    //Localizadores de elementos

    public static By iniciolabel = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a");
    public static By usernameInput = By.id("field-email");
    public static By passwordInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By errorMessage = By.xpath("//*[@id=\"content\"]/section/div/ul/li");




}

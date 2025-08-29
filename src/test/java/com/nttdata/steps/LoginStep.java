package com.nttdata.steps;
import com.nttdata.page.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;

import static com.nttdata.core.DriverManager.screenShot;
import static com.nttdata.page.LoginPage.*;


public class LoginStep {
    private WebDriver driver;
    public LoginStep(WebDriver driver){
        this.driver = driver;
    }
    LoginPage loginPage = new LoginPage();


    public void login(String user, String pass){

            driver.findElement(iniciolabel).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(user);
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(pass);
        driver.findElement(loginButton).click();
// Si el elemento es encontrado, la aserción pasará
            Assert.assertTrue(" Error: El mensaje de error se encontró en la página.",driver.findElements(errorMessage).isEmpty());



    }

    public void selectToCategory(String cat, String subcat) {
        //Select drpCategory = new Select(driver.findElement(By.name(cat)));

        String mainCatXpath = String.format("//ul[@id='top-menu']/li/a[contains(., '%s')]", cat);
        boolean elementoNoEncontrado = false;
        try {
            driver.findElement(By.xpath(mainCatXpath));
        } catch (NoSuchElementException e) {
            // Si la excepción se lanza, significa
            // que el elemento NO fue encontrado
           elementoNoEncontrado = true;
        }
        Assert.assertFalse("La categoria no fue encontrada en la página.",elementoNoEncontrado);


        WebElement mainCategoryElement = driver.findElement(By.xpath(mainCatXpath));

        String textoEnlace = mainCategoryElement.getText().trim().toLowerCase();
        Assert.assertEquals("El texto  no coincide con la variable 'cat'.",cat.toLowerCase(),textoEnlace);

        //Si existe categoria ir a subcategoria
            Actions actions = new Actions(driver);
            actions.moveToElement(mainCategoryElement).perform();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            String subCatXpath = String.format("//ul[@id='top-menu']/li/a[contains(., '%s')]/following-sibling::div//a[contains(., '%s')]", cat, subcat);
            WebElement subCategoryElement = driver.findElement(By.xpath(subCatXpath));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subCatXpath)));

            subCategoryElement.click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
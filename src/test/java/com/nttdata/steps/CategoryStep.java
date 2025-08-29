package com.nttdata.steps;
import com.nttdata.page.CategoryPage;
import com.nttdata.core.DriverManager;
import com.nttdata.page.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;






public class CategoryStep {
    private WebDriver driver;

    public CategoryStep(WebDriver driver){
        this.driver = driver;
    }




    public void selectProduct(){
        WebElement productElement = driver.findElement(CategoryPage.getItemSelect());
        productElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductPage.getNameProduct()));


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }







}

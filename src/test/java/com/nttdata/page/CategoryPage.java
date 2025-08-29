package com.nttdata.page;

import com.nttdata.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.nttdata.page.LoginPage.iniciolabel;

public class CategoryPage {

    private WebDriver driver;

    public CategoryPage(){
        this.driver = DriverManager.getDriver();
    }

    public void selectToCategory(String cat, String subcat) {

    }

    public void goToCategory(String category, String subcategory){
        try{
            driver.findElement(By.linkText(category)).click();
            driver.findElement(By.linkText(subcategory)).click();
        }catch(Exception e){
            throw new RuntimeException("Categoría o subcategoría no encontrada: " + category + " / " + subcategory);
        }
    }

    public void addFirstProduct(int qty){
        List<WebElement> products = driver.findElements(By.cssSelector(".product"));
        if(products.isEmpty()) throw new RuntimeException("No se encontraron productos en la categoría");
        WebElement firstProduct = products.get(0);
        WebElement qtyInput = firstProduct.findElement(By.cssSelector("input.quantity"));
        qtyInput.clear();
        qtyInput.sendKeys(String.valueOf(qty));
        firstProduct.findElement(By.cssSelector("button.add-to-cart")).click();
    }


}

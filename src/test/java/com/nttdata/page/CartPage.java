package com.nttdata.page;
import com.nttdata.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private WebDriver driver;

    private By cartTitle = By.cssSelector("h1.cart-title");
    private By totalPrice = By.cssSelector(".cart-total");

    public CartPage(){
        this.driver = DriverManager.getDriver();
    }

    public boolean isDisplayed(){
        return driver.findElements(cartTitle).size() > 0;
    }

    public String getTotal(){
        return driver.findElement(totalPrice).getText();
    }
}

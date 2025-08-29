package com.nttdata.steps;
import com.nttdata.page.CarPage;

import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class CarStep {


    private WebDriver driver;

    public CarStep(WebDriver driver){
        this.driver = driver;
    }

    public boolean getTitleCar() {

            String hCarrito =driver.findElement(CarPage.headerCar).getText();
           assertEquals("CARRITO", hCarrito,"No es el titulo de Carrito");
        return hCarrito.equals("CARRITO");

    }
    public String getPriceCar() {
        return driver.findElement(CarPage.priceFinalCar).getText();


    }
}

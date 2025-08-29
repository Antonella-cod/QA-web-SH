package com.nttdata.page;
import org.openqa.selenium.By;

public class ProductPage {


    public static By nameProduct = By.xpath("//*[@id='main']/div[1]/div[2]/h1");
    public static By cantInpProduct = By.xpath("//*[@id=\"quantity_wanted\"]");
    public static By btnAddCarProduct = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button");
    public static By priceUnitProduct = By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[1]");
    public static By priceModal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By BtnEndModal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");

    public static By getBtnEndModal() {
        return BtnEndModal;
    }



    public static By getPriceModal() {
        return priceModal;
    }



    public static By getPriceUnitProduct() {
        return priceUnitProduct;
    }




    public static By confTextPopup = By.id("myModalLabel");

    public static By getConfTextPopup() {
        return confTextPopup;
    }

    public static By getCantInpProduct() {
        return cantInpProduct;
    }






    public static By getNameProduct() {
        return nameProduct;
    }
}

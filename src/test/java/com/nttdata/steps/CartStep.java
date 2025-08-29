package com.nttdata.steps;
import com.nttdata.page.CartPage;
public class CartStep {
    CartPage cartPage = new CartPage();

    public boolean isCartVisible(){
        return cartPage.isDisplayed();
    }

    public String getTotal(){
        return cartPage.getTotal();
    }
}

package com.nttdata.page;


import org.openqa.selenium.By;


public class CategoryPage {


    public static By getItemSelect() {
        return itemSelect;
    }



    public static By itemSelect = By.xpath("//a[contains(text(), 'Hummingbird')]");







}

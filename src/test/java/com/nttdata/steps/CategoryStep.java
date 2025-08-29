package com.nttdata.steps;
import com.nttdata.page.CategoryPage;
public class CategoryStep {
    CategoryPage categoryPage = new CategoryPage();

    public void selectCategory(String cat, String subcat){
        categoryPage.selectToCategory(cat, subcat);
        categoryPage.goToCategory(cat, subcat);
    }

    public void addProduct(int qty){
        categoryPage.addFirstProduct(qty);
    }
}

package com.nttdata.stepsdefinitions;
import com.nttdata.core.DriverManager;
import com.nttdata.steps.CategoryStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;

public class CategoryStepDefinition {
    CategoryStep categoryStep = new CategoryStep();

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoCategoria(String cat, String subcat){

        categoryStep.selectCategory(cat, subcat);
        DriverManager.screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoProducto(int qty){
        categoryStep.addProduct(qty);
        DriverManager.screenShot();
    }
}

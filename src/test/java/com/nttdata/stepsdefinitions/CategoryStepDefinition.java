package com.nttdata.stepsdefinitions;
import com.nttdata.steps.CategoryStep;
import com.nttdata.steps.ProductStep;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import com.nttdata.context.TestContext;

import static com.nttdata.core.DriverManager.*;
import com.nttdata.context.TestContext;

public class CategoryStepDefinition {
    private final TestContext testContext;

    public CategoryStepDefinition(TestContext context) {
        this.testContext = context;
        this.testContext.driver = getDriver();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoProducto(int qty){
        testContext.qty = qty;
        //setQty(qty);
       // driver = getDriver();
        CategoryStep categoryStep = new CategoryStep(testContext.driver);
        categoryStep.selectProduct();
        screenShot();

        ProductStep productStep = new ProductStep(testContext.driver);
        productStep.addProduct(testContext.qty);
        screenShot();


    };


}

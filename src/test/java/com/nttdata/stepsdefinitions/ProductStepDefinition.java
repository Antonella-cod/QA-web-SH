package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.StepDefinitionAnnotation;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import com.nttdata.context.TestContext;
import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class ProductStepDefinition {
    private final TestContext testContext;

    // PicoContainer inyecta automáticamente la misma instancia del TestContext
    public ProductStepDefinition(TestContext context) {
        this.testContext = context;
    }


    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnPopupProductoAgregado() {


        ProductStep productStep = new ProductStep(testContext.driver);
        String textoLimpioRegex = productStep.getProduct().replaceAll("", "");
        Assertions.assertEquals("Producto añadido correctamente a su carrito de compra", textoLimpioRegex,"No se ha confirmado Producto");


    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoPopupMontoTotal() {

        int expectedQty = testContext.qty;
        ProductStep productStep = new ProductStep(testContext.driver);
        float priceUnit = Float.parseFloat(productStep.getPriceUnitProduct().replaceAll("S/ ",""));

        float priceTotalE = priceUnit*expectedQty;
        testContext.priceTotalE = priceTotalE;

        //total de modal
        float priceTotalModal = Float.parseFloat(productStep.getPriceModal().replaceAll("S/ ",""));
         Assertions.assertEquals(priceTotalE,priceTotalModal,"Precio Total no coincide con el ingresado");

        screenShot();


    }

    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {
        ProductStep productStep = new ProductStep(testContext.driver);

        productStep.EndModal();


    }
}

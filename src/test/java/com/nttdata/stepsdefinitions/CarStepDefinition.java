package com.nttdata.stepsdefinitions;
import com.nttdata.steps.CarStep;
import com.nttdata.context.TestContext;
import com.nttdata.steps.ProductStep;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;

import static com.nttdata.core.DriverManager.screenShot;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarStepDefinition {
    private final TestContext testContext;

    public CarStepDefinition(TestContext context) {
        this.testContext = context;
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void validoCarrito(){
        CarStep carStep = new CarStep(testContext.driver);
        assertTrue(carStep.getTitleCar());

    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void validoTotal(){

        float priceTotalE = testContext.priceTotalE;
        CarStep carStep = new CarStep(testContext.driver);
        float priceTotalCar = Float.parseFloat(carStep.getPriceCar().replaceAll("S/ ",""));
        Assertions.assertEquals(priceTotalE,priceTotalCar,"Precio Total en Carrito no coincide con el ingresado");;
        screenShot();
    }


}


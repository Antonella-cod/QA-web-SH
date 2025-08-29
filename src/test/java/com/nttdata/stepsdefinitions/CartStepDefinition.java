package com.nttdata.stepsdefinitions;
import com.nttdata.core.DriverManager;
import com.nttdata.steps.CartStep;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class CartStepDefinition {
    CartStep cartStep = new CartStep();

    @Entonces("valido el titulo de la pagina del carrito")
   /* public void validoCarrito(){
        assertTrue(cartStep.isCartVisible());
        DriverManager.screenShot();
    }*/

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void validoTotal(){
       // assertNotNull(cartStep.getTotal());
     //   DriverManager.screenShot();
    }
}


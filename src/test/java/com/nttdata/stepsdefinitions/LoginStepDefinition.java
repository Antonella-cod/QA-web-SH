package com.nttdata.stepsdefinitions;


import com.nttdata.core.DriverManager;
import com.nttdata.steps.LoginStep;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepDefinition {
    private WebDriver driver;

    private LoginStep LoginStep(WebDriver driver){
        return new LoginStep(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPagina(){
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        DriverManager.screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueo(String user, String pass){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(user, pass);
        screenShot();
    }

/*
    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("que me encuentro en la página de login de Saucedemo")
    public void que_me_encuentro_en_la_página_de_login_de_sacedemo() {
        driver = getDriver();
        driver.get("https://www.saucedemo.com/");
        screenShot();
    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }
    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String title =  inventorySteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
    }
    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
*/


}

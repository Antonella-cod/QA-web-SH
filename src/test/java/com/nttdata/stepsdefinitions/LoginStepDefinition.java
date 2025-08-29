package com.nttdata.stepsdefinitions;


import com.nttdata.core.DriverManager;

import com.nttdata.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepDefinition {
    private WebDriver driver;



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
    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoCategoria(String cat, String subcat){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.selectToCategory(cat, subcat);
        Assert.assertTrue( "No se navegó a la página de la subcategoría.",driver.getCurrentUrl().contains(subcat.toLowerCase()));
        screenShot();
    }



}

package com.nttdata.steps;
import com.nttdata.page.ProductPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductStep {
    private WebDriver driver;

    public ProductStep(WebDriver driver){
        this.driver = driver;
    }

    public void addProduct(int qty){

        WebElement cantInBtn = driver.findElement(ProductPage.getCantInpProduct());
        cantInBtn.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        cantInBtn.sendKeys(Keys.DELETE);
        cantInBtn.sendKeys(String.valueOf(qty));

        WebElement addBtn = driver.findElement(ProductPage.btnAddCarProduct);
        addBtn.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public String getProduct() {

        return driver.findElement(ProductPage.getConfTextPopup()).getText();

    }
    public String getPriceUnitProduct() {
        return driver.findElement(ProductPage.getPriceUnitProduct()).getText();

    }

    public String getPriceModal() {
        return driver.findElement(ProductPage.getPriceModal()).getText();

    }

    public void EndModal(){
        WebElement EndBtn = driver.findElement(ProductPage.getBtnEndModal());
        EndBtn.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

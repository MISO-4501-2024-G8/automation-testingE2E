package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSignIn {

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement tuEspacio;

    @FindBy(id = "email")
    WebElement emailDeportista;

    @FindBy(id = "password")
    WebElement passwordDeportista;

    @FindBy(xpath = "(//button[@class='btn btn-warning'])[1]")
    WebElement botonIngresar;

    @FindBy(xpath = "(//button[@class='btn btn-warning'])[2]")
    WebElement botonSalir;

    public PageSignIn(WebDriver driver) {   
        PageFactory.initElements(driver, this);
    }

    public void tuEspacioInicio(){
        tuEspacio.click();
    }

    public void emailDeportista(String usuario){
        emailDeportista.sendKeys(usuario);
    }

    public void passwordDeportista(String contraseña){
        passwordDeportista.sendKeys(contraseña);
    }

    public void botonIngresarDeportista(){
        botonIngresar.click();
    }

    public void botonSalirDeportista(){
        botonSalir.click();
    }

}

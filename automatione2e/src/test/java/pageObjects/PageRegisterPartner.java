package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageRegisterPartner {

    @FindBy(xpath = "//a[contains(text(),'Socios')]")
    WebElement btnSocios;

    @FindBy(xpath = "//button[contains(text(),'Agregar Socio')]")
    WebElement btnAgregarSocio;

    @FindBy(id = "name")
    WebElement nombreCompania;

    @FindBy(id = "docType")
    WebElement tipoDocCompania;

    @FindBy(id = "docNum")
    WebElement numeroDocCompania;

    @FindBy(id = "phone")
    WebElement numeroTelefonoCompania;

    @FindBy(xpath  = "//input[@id='company_creation_date']")
    WebElement fechaCreacionCompania;

    @FindBy(id = "company_address")
    WebElement direccionCompania;

    @FindBy(id = "contact_name")
    WebElement nombreContacto;

    @FindBy(id = "company_description")
    WebElement descripcionCompania;

    @FindBy(id = "email")
    WebElement correoCompania;

    @FindBy(id = "password")
    WebElement contrasenaCompania;

    @FindBy(id = "acceptanceTyc")
    WebElement aceptaTyC;

    @FindBy(id = "btnContinueSignup")
    WebElement btnContinuar;

    public PageRegisterPartner(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void sociosHome(){
        btnSocios.click();
    }

    public void btnAgregarSocios(){
        btnAgregarSocio.click();
    }

    public void nombreCompania(String nombre){
        nombreCompania.sendKeys(nombre);
    }

    public void tipoDocCompania(String tipo){
        tipoDocCompania.sendKeys(tipo);
    }

    public void numeroDocCompania(String numero){
        numeroDocCompania.sendKeys(numero);
    }

    public void numeroTelefonoCompania(String numero){
        numeroTelefonoCompania.sendKeys(numero);
    }

    public void fechaCreacionCompania(){
        fechaCreacionCompania.click();
    }

    public void direccionCompania(String direccion){
        direccionCompania.sendKeys(direccion);
    }

    public void nombreContacto(String nombre){
        nombreContacto.sendKeys(nombre);
    }

    public void descripcionCompania(String descripcion){
        descripcionCompania.sendKeys(descripcion);
    }

    public void correoCompania(String correo){
        correoCompania.sendKeys(correo);
    }

    public void contrasenaCompania(String contrasena){
        contrasenaCompania.sendKeys(contrasena);
    }

    public void aceptaTyC(){
        aceptaTyC.click();
    }

    public void btnContinuar(){
        btnContinuar.submit();
    }

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageRegisterUser {

    @FindBy(xpath = "//a[contains(text(),'Inscribete Ya!')]")
    WebElement registro;

    @FindBy(id = "name")
    WebElement nombre;

    @FindBy(id = "surname")
    WebElement apellido;

    @FindBy(id = "docType")
    WebElement tipoDocumento;

    @FindBy(id = "docNum")
    WebElement numeroDocumento;

    @FindBy(id = "phone")
    WebElement numeroTelefono;

    @FindBy(id = "age")
    WebElement edad;

    @FindBy(id = "gender")
    WebElement genero;

    @FindBy(id = "weight")
    WebElement peso;

    @FindBy(id = "height")
    WebElement altura;

    @FindBy(id = "birthCountry")
    WebElement paisNacimiento;

    @FindBy(id = "birthCity")
    WebElement ciudadNacimiento;

    @FindBy(id = "residenceCountry")
    WebElement paisResidencia;

    @FindBy(id = "residenceCity")
    WebElement ciudadResidencia;

    @FindBy(id = "residenceSeniority")
    WebElement tiempoResidencia;

    @FindBy(id = "sports")
    WebElement seleccionDeporte;

    @FindBy(id = "email")
    WebElement correo;

    @FindBy(id = "password")
    WebElement contrasena;

    @FindBy(id = "acceptanceNotify")
    WebElement aceptaNotificaciones;

    @FindBy(id = "acceptanceTyc")
    WebElement aceptarTyC;

    @FindBy(id = "acceptancePersonalData")
    WebElement aceptarPersonalData;

    @FindBy(id = "btnContinueSignup")
    WebElement btnAceptar;

    public PageRegisterUser(WebDriver driver) {   
        PageFactory.initElements(driver, this);
    }

    public void registroDeportista(){
        registro.click();
    }

    public void nombreDeportista(String name){
        nombre.sendKeys(name);
    }

    public void apellidoDeportista(String surname){
        apellido.sendKeys(surname);
    }

    public void tipoDocumentoDeportista(String docType){
        tipoDocumento.sendKeys(docType);
    }

    public void numeroDocumentoDeportista(String docNum){
        numeroDocumento.sendKeys(docNum);
    }

    public void numeroTelefonoDeportista(String phone){
        numeroTelefono.sendKeys(phone);
    }

    public void edadDeportista(String age){
        edad.sendKeys(age);
    }

    public void generoDeportista(String gender){
        genero.sendKeys(gender);
    }

    public void pesoDeportista(String weight){
        peso.sendKeys(weight);
    }

    public void alturaDeportista(String height){
        altura.sendKeys(height);
    }

    public void paisNacimientoDeportista(String country){
        paisNacimiento.sendKeys(country);
    }

    public void ciudadNacimientoDeportista(String city){
        ciudadNacimiento.sendKeys(city);
    }

    public void paisResidenciaDeportista(String country){
        paisResidencia.sendKeys(country);
    }

    public void ciudadResidenciaDeportista(String city){
        ciudadResidencia.sendKeys(city);
    }

    public void tiempoResidenciaDeportista(String seniority){
        tiempoResidencia.sendKeys(seniority);
    }

    public void seleccionDeporteDeportista(String deporte){
        Select se = new Select(seleccionDeporte);
        se.selectByValue(deporte);;
    }

    public void correoDeportista(String email){
        correo.sendKeys(email);
    }

    public void contrasenaDeportista(String password){
        contrasena.sendKeys(password);
    }

    public void aceptaNotificacionesDeportista(){
        aceptaNotificaciones.click();
    }

    public void aceptarTyCDeportista(){
        aceptarTyC.click();
    }

    public void aceptarPersonalDataDeportista(){
        aceptarPersonalData.click();
    }

    public void btnAceptarDeportista(){
        btnAceptar.click();
    }
}

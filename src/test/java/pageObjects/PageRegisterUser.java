package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PageRegisterUser {
	
	ExtentTest test;

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

    @FindBy(xpath = "//*[@id=\"sports\"]/option[2]")
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

    public PageRegisterUser(WebDriver driver, ExtentTest test) {  
    	this.test = test;
        PageFactory.initElements(driver, this);
    }

    public void registroDeportista(){
        registro.click();
        test.log(LogStatus.INFO, "Click en botón de Registro Deportista");
    }

    public void nombreDeportista(String name){
        nombre.sendKeys(name);
        test.log(LogStatus.INFO, "Ingreso Nombre Deportista: "+name);
    }

    public void apellidoDeportista(String surname){
        apellido.sendKeys(surname);
        test.log(LogStatus.INFO, "Ingreso Apellido Deportista: "+surname);
    }

    public void tipoDocumentoDeportista(String docType){
        tipoDocumento.sendKeys(docType);
        test.log(LogStatus.INFO, "Ingreso Tipo Documento: "+docType);
    }

    public void numeroDocumentoDeportista(String docNum){
        numeroDocumento.sendKeys(docNum);
        test.log(LogStatus.INFO, "Ingreso Número Documento: "+docNum);
    }

    public void numeroTelefonoDeportista(String phone){
        numeroTelefono.sendKeys(phone);
        test.log(LogStatus.INFO, "Ingreso número de teléfono: "+phone);
    }

    public void edadDeportista(String age){
        edad.sendKeys(age);
        test.log(LogStatus.INFO, "Ingreso Edad deportista: "+age);
    }

    public void generoDeportista(String gender){
        genero.sendKeys(gender);
        test.log(LogStatus.INFO, "Ingreso genero deportista: "+gender);
    }

    public void pesoDeportista(String weight){
        peso.sendKeys(weight);
        test.log(LogStatus.INFO, "Ingreso peso deportista: "+weight);
    }

    public void alturaDeportista(String height){
        altura.sendKeys(height);
        test.log(LogStatus.INFO, "Ingreso Edad Deportista: "+height);
    }

    public void paisNacimientoDeportista(String country){
        paisNacimiento.sendKeys(country);
        test.log(LogStatus.INFO, "Ingreso pais de nacimiento: "+country);
    }

    public void ciudadNacimientoDeportista(String city){
        ciudadNacimiento.sendKeys(city);
        test.log(LogStatus.INFO, "Ingreso ciudad de nacimiento deportista: "+city);
    }

    public void paisResidenciaDeportista(String country){
        paisResidencia.sendKeys(country);
        test.log(LogStatus.INFO, "Ingreso país residencia deportista: "+country);
    }

    public void ciudadResidenciaDeportista(String city){
        ciudadResidencia.sendKeys(city);
        test.log(LogStatus.INFO, "Ingreso de ciudad de residencia deportista: "+city);
    }

    public void tiempoResidenciaDeportista(String seniority){
        tiempoResidencia.sendKeys(seniority);
        test.log(LogStatus.INFO, "ingreso de tiempo de residencia: "+seniority);
    }

    public void seleccionDeporteDeportista(String deporte){
    	seleccionDeporte.click();
    	test.log(LogStatus.INFO, "Selección de deporte: "+deporte);
    }

    public void correoDeportista(String email){
        correo.sendKeys(email);
        test.log(LogStatus.INFO, "Ingreso correo deportista: "+email);
    }

    public void contrasenaDeportista(String password){
        contrasena.sendKeys(password);
        test.log(LogStatus.INFO, "Ingreso de contraseña: "+password);
    }

    public void aceptaNotificacionesDeportista(){
        aceptaNotificaciones.click();
        test.log(LogStatus.INFO, "Aceptación de Notificaciones");
    }

    public void aceptarTyCDeportista(){
        aceptarTyC.click();
        test.log(LogStatus.INFO, "Aceptación de terminos y condiciones");
    }

    public void aceptarPersonalDataDeportista(){
        aceptarPersonalData.click();
        test.log(LogStatus.INFO, "Aceptación de tratamiento de datos personales");
    }

    public void btnAceptarDeportista(){
        btnAceptar.click();
        test.log(LogStatus.INFO, "Click en botón de continuar y finalizar");
    }
}

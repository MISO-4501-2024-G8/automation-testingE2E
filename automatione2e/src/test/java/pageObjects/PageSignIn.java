package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSignIn {

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement tuEspacio;

    public PageSignIn(WebDriver driver) {   
        PageFactory.initElements(driver, this);
    }

    public void tuEspacioInicio(){
        tuEspacio.click();
    }

}

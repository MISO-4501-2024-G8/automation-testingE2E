package pruebas;

import org.testng.annotations.Test;

public class PruebaHome extends BaseTestSuite{

    @Test
    public void clickTuEspacio(){
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
        tuEspacioInicial.tuEspacioInicio();
    }

}

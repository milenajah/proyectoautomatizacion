package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div@class= ' d-none d - lg-block']//strong[contains(text(),'ingresar')]"));
    public static final Target INPUT_USER = Target.the("Where do we write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("username"));
}


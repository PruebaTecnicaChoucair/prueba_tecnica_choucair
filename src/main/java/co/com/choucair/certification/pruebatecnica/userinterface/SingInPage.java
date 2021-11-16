package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SingInPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button that show us the form to create an account")
            .located(By.xpath("//div[@class='unauthenticated-container']//a[@class='unauthenticated-nav-bar__sign-up']"));
}

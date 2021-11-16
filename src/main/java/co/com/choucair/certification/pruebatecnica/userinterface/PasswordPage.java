package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PasswordPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the password again")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_OF_USE = Target.the("where do we accept the uTest Terms of Use")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("where do we accept the Privacy and Security Policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("button to complete registration")
            .located(By.xpath("//div[@class='ui-view']//a[@class='btn btn-blue']"));

}

package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target INPUT_FIRST_NAME =Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("where do we select the birthday month")
            .located(By.id("birthMonth"));
    public static final Target INPUT_BIRTH_DAY = Target.the("where do we select the day of birth")
            .located(By.id("birthDay"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("where do we select the birthday year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT = Target.the("button to second step")
            .located(By.xpath("//div[@class='ui-view']//a[@class='btn btn-blue']"));
}

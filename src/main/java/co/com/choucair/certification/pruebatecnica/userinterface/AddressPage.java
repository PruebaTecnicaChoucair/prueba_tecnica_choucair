package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddressPage extends PageObject {
    public static final Target INPUT_CITY =Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write the postal code")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("button to third step")
            .located(By.xpath("//div[@class='ui-view']//a[@class='btn btn-blue pull-right']"));
}

package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UserData;
import co.com.choucair.certification.pruebatecnica.userinterface.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LoginAddress implements Task {

    private String city;
    private String zip;

    public LoginAddress(String city, String zip) {
        this.city = city;
        this.zip = zip;
    }

    public static LoginAddress onThePAge(String city, String zip) {
        return Tasks.instrumented(LoginAddress.class, city, zip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(AddressPage.INPUT_CITY),
                Enter.theValue(zip).into(AddressPage.INPUT_POSTAL_CODE),
                Click.on(AddressPage.BUTTON_NEXT));

    }
}

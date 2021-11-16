package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LoginDevices implements Task {
    public static LoginDevices onThePage() {
        return Tasks.instrumented(LoginDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(//Click.on(DevicesPage.INPUT_COMPUTER),
                //Enter.theValue("Windows").into(DevicesPage.INPUT_COMPUTER_TEXT)
                Click.on(DevicesPage.BUTTON_NEXT));

    }
}

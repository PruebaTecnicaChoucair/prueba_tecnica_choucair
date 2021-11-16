package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginPassword implements Task {
    private String password;
    private String confirmedPassword;

    public LoginPassword(String password, String confirmedPassword) {
        this.password = password;
        this.confirmedPassword = confirmedPassword;
    }

    public static LoginPassword onThePage(String password, String confirmedPassword) {
        return Tasks.instrumented(LoginPassword.class, password, confirmedPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(password).into(PasswordPage.INPUT_PASSWORD),
                Enter.theValue(confirmedPassword).into(PasswordPage.INPUT_CONFIRM_PASSWORD),
                Click.on(PasswordPage.CHECK_TERMS_OF_USE),
                Click.on(PasswordPage.CHECK_PRIVACY),
                Click.on(PasswordPage.BUTTON_COMPLETE));

    }
}

package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String birthDay;
    private String birthMonth;
    private String birthYear;

    public Login(String firstName, String lastName, String email, String birthDay, String birthMonth, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public static Login onThePage(String firstName, String lastName, String email, String birthDay, String birthMonth, String birthYear) {
        return Tasks.instrumented(Login.class, firstName, lastName, email, birthDay, birthMonth, birthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(firstName).into(RegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(RegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(RegisterPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(RegisterPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(RegisterPage.INPUT_BIRTH_YEAR),
                //Enter.theValue("Spanish").into(RegisterPage.INPUT_LANGUAGES)
                Click.on(RegisterPage.BUTTON_NEXT));
    }
}

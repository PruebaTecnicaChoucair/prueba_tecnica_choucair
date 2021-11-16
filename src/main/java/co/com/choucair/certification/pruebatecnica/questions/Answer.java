package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String welcomeText;

    public Answer(String welcomeText){
        this.welcomeText = welcomeText;
    }

    public static Answer toThe(String welcomeText) {
        return new Answer(welcomeText);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String text = Text.of(FinishPage.WELCOME_TEXT).viewedBy(actor).asString();
        if(welcomeText.equals(text)){
            result = true;

        }
        else {
            result = false;
        }
        return result;
    }
}

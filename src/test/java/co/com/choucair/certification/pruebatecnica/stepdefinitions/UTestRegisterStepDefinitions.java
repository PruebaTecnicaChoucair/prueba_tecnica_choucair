package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.UserData;
import co.com.choucair.certification.pruebatecnica.model.WelcomeText;
import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestRegisterStepDefinitions {

    int index = 0;

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Brandon is a new user$")
    public void brandonIsANewUser() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^Brandon fill out the form for getting its paid testing project list$")
    public void brandonFillOutTheFormForGettingItsPaidTestingProjectList(List<UserData> userData) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onThePage(userData.get(index).getFirstName(),
                        userData.get(index).getLastName(),
                        userData.get(index).getEmail(),
                        userData.get(index).getBirthDay(),
                        userData.get(index).getBirthMonth(),
                        userData.get(index).getBirthYear()),
                (LoginAddress.onThePAge(userData.get(index).getCity(),
                        userData.get(index).getZip())),
                (LoginDevices.onThePage()),
                (LoginPassword.onThePage(userData.get(index).getPassword(),
                        userData.get(index).getConfirmedPassword()))
        );

    }

    @Then("^should be shown the text$")
    public void aWelcomeTextShouldBeShown(List<WelcomeText> welcomeText) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(welcomeText.get(index).getWelcomeText())));
    }
}

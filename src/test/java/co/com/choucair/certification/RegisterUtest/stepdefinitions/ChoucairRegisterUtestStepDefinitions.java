package co.com.choucair.certification.RegisterUtest.stepdefinitions;

import co.com.choucair.certification.RegisterUtest.tasks.OpenUp;
import co.com.choucair.certification.RegisterUtest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairRegisterUtestStepDefinitions {

    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the Utest website we look for the Join Today registration$")
    public void theUtestComWebsiteWeLookForTheJoinTodayRegistration() {
        OnStage.theActorCalled("Utest").wasAbleTo(OpenUp.thePage(),  (Register.onThePage()));
    }


    @When("^you enter this section you fill in the required information and save$")
    public void youEnterThisSectionYouFillInTheRequiredInformationAndSave() {

    }

    @Then("^this stores the user to then be able to access and use the services of the platform$")
    public void thisStoresTheUserToThenBeAbleToAccessAndUseTheServicesOfThePlatform() {

    }
}
package co.com.choucair.certification.RegisterUtest.stepdefinitions;

import co.com.choucair.certification.RegisterUtest.model.UtestChoucairData;
import co.com.choucair.certification.RegisterUtest.tasks.OpenUp;
import co.com.choucair.certification.RegisterUtest.tasks.Register;
import co.com.choucair.certification.RegisterUtest.tasks.ReturnHome;
import co.com.choucair.certification.RegisterUtest.userinterface.ChoucairRegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairRegisterUtestStepDefinitions {
    private ChoucairRegisterPage choucairRegisterPage;

    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the Utest website we look for the Join Today registration$")
    public void theUtestComWebsiteWeLookForTheJoinTodayRegistration(List<UtestChoucairData> utestChoucairData) throws Exception {
        OnStage.theActorCalled("Utest").wasAbleTo(OpenUp.thePage());
    }


    @When("^you enter this section you fill in the required information and save$")
    public void youEnterThisSectionYouFillInTheRequiredInformationAndSave(List<UtestChoucairData> utestChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage(
                utestChoucairData.get(0).getStrFirstName(),
                utestChoucairData.get(0).getStrLastName(),
                utestChoucairData.get(0).getStrEmail(),
                utestChoucairData.get(0).getStrMonth(),
                utestChoucairData.get(0).getStrDay(),
                utestChoucairData.get(0).getStrYear(),
                //utestChoucairData.get(0).getStrLanguage(),
                utestChoucairData.get(0).getStrCity(),
                utestChoucairData.get(0).getStrZipCode(),
                utestChoucairData.get(0).getStrCountry()
                //utestChoucairData.get(0).getStrComputer()
                //utestChoucairData.get(0).getStrVersion()
                //utestChoucairData.get(0).getStrMobile(),
                //utestChoucairData.get(0).getStrModel(),
                //utestChoucairData.get(0).getStrOS()
        ));
    }

    @Then("^this stores the user to then be able to access and use the services of the platform$")
    public void thisStoresTheUserToThenBeAbleToAccessAndUseTheServicesOfThePlatform(List<UtestChoucairData> utestChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(ReturnHome.homePage());
    }
}

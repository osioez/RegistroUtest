package co.com.choucair.certification.RegisterUtest.tasks;

import co.com.choucair.certification.RegisterUtest.userinterface.ChoucairRegisterPage;
import co.com.choucair.certification.RegisterUtest.userinterface.ChoucairUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.thucydides.core.pages.components.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Register implements Task{
    private  String strFirstName;
    private  String strLastName;
    private  String strEmail;
    private  String strMonth;
    private  String strDay;
    private  String strYear;
    //private  String strLanguage;
    private String strCity;
    private String strZipCode;
    private String strCountry;

    //private String strComputer;
    //private String strVersion;
    //private String strLanguag;
    //private String strMobile;
    //private String strModel;
    //private String strOS;


    public Register(String strFirstName, String strLastName, String strEmail,String strMonth,String strDay,
                    String strYear,String strCity,String strZipCode,String strCountry) {

        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        //this.strLanguage = strLanguage;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
        //this.strComputer = strComputer;
        //this.strVersion = strVersion;
        //this.strMobile = strMobile;
        //this.strModel = strModel;
       // this.strOS = strOS;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmail, String strMonth,
                                     String strDay, String strYear, String strCity, String strZipCode,
                                     String strCountry) {

        return Tasks.instrumented(Register.class,strFirstName, strLastName, strEmail, strMonth, strDay,
                strYear, strCity, strZipCode, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairRegisterPage.joinToday),

                Enter.theValue(strFirstName).into(ChoucairRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(ChoucairRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(ChoucairRegisterPage.INPUT_EMAIL),
                Enter.keyValues(strMonth).into(ChoucairRegisterPage.INPUT_MONTH),
                Enter.keyValues(strDay).into(ChoucairRegisterPage.INPUT_DAY),
                Enter.keyValues(strYear).into(ChoucairRegisterPage.INPUT_YEAR),
                //Enter.keyValues(strLanguage).into(ChoucairRegisterPage.SELECT_LANGUAGE),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON0),

                Enter.theValue(strCity).into(ChoucairRegisterPage.INPUT_CITY),
                Enter.theValue(strZipCode).into(ChoucairRegisterPage.INPUT_ZIP),
                Enter.keyValues(strCountry).into(ChoucairRegisterPage.SELECT_COUNTRY),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON1)

                //Enter.keyValues(strComputer).into(ChoucairRegisterPage.INPUT_PC),
                //Enter.keyValues(strVersion).into(ChoucairRegisterPage.SELECT_VERSION),
                //Enter.keyValues(strMobile).into(ChoucairRegisterPage.INPUT_MOVIL),
                //Enter.keyValues(strModel).into(ChoucairRegisterPage.INPUT_MODEL),
                //Enter.keyValues(strOS).into(ChoucairRegisterPage.SELECT_OS),
                //Click.on(ChoucairRegisterPage.NEXT_BUTTON2)
                );
    }
}


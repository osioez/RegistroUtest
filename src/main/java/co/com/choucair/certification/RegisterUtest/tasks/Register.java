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
import org.openqa.selenium.By;

public class Register implements Task{
    private  String strFirstName;
    private  String strLastName;
    private  String strEmail;
    private  String strMonth;
    private  String strDay;
    private  String strYear;
    //private  String strLanguage;

    public Register(String strFirstName, String strLastName, String strEmail,String strMonth,String strDay,String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        //this.strLanguage = strLanguage;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(Register.class,strFirstName, strLastName, strEmail, strMonth, strDay, strYear);
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
                Click.on(ChoucairRegisterPage.NEXT_BUTTON0)
                //Enter.theValue(strLanguage).into(ChoucairRegisterPage.SELECT_LANGUAGE)
                //SelectFromOptions.byValue(strLanguage).from(By.name("Spanish"))
                //Click.on(ChoucairRegisterPage.SELECT_LANGUAGE)


                //Click.on(ChoucairRegisterPage.INPUT_CITY),
                //Enter.theValue("705030").into(ChoucairRegisterPage.INPUT_ZIP),
                //Enter.theValue("Colombia").into(ChoucairRegisterPage.SELECT_COUNTRY),
                //Click.on(ChoucairRegisterPage.NEXT_BUTTON1),

                //SelectFromOptions.byVisibleText("Windows").from(By.className("ui-select-match")),
                //Click.on(ChoucairRegisterPage.INPUT_PC),
                //Click.on(ChoucairRegisterPage.SELECT_VERSION),
                //Click.on(ChoucairRegisterPage.SELECT_LANGUAG),
                //Click.on(ChoucairRegisterPage.INPUT_MOVIL),
                //Click.on(ChoucairRegisterPage.INPUT_MODEL),
                //Click.on(ChoucairRegisterPage.SELECT_OS),
                //Click.on(ChoucairRegisterPage.NEXT_BUTTON2),

                //Enter.theValue("Mm@123456.").into(ChoucairRegisterPage.INPUT_PASS),
                //Enter.theValue("Mm@123456.").into(ChoucairRegisterPage.INPUT_CONFIPASS),
                //Click.on(ChoucairRegisterPage.CHECK_TERM),
                //Click.on(ChoucairRegisterPage.CHECK_PRIVACY),
                //Click.on(ChoucairRegisterPage.NEXT_BUTTON3)
                );
    }
}


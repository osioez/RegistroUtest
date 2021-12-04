package co.com.choucair.certification.RegisterUtest.tasks;

import co.com.choucair.certification.RegisterUtest.userinterface.ChoucairRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

public class Register implements Task{
    private  String strFirstName;
    private  String strLastName;

    public Register(String strFirstName, String strLastName) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
    }

    public static Register onThePage(String strFirstName, String strLastName) {
        return Tasks.instrumented(Register.class,strFirstName, strLastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairRegisterPage.joinToday),

                Enter.theValue(strFirstName).into(ChoucairRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(ChoucairRegisterPage.INPUT_LASTNAME)

                //Enter.theValue("hansel@correo.com").into(ChoucairRegisterPage.INPUT_EMAIL),
                //SelectFromOptions.byValue("number:12").from(By.id("birthMonth")),
                //SelectFromOptions.byValue("number:2").from(By.id("birthDay")),
                //SelectFromOptions.byValue("number:1987").from(By.id("birthYear")),
                //SelectFromOptions.byValue("languages").from(By.id("Spanish")),
                //Click.on(ChoucairRegisterPage.SELECT_LANGUAGE),
                //Click.on(ChoucairRegisterPage.NEXT_BUTTON0),

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


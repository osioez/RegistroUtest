package co.com.choucair.certification.RegisterUtest.tasks;

import co.com.choucair.certification.RegisterUtest.userinterface.ChoucairRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task{
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairRegisterPage.joinToday),
                Enter.theValue("carlos").into(ChoucairRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue("martinez").into(ChoucairRegisterPage.INPUT_LASTNAME),
                Enter.theValue("cmmarting@gmail.com").into(ChoucairRegisterPage.INPUT_EMAIL),
                Click.on(ChoucairRegisterPage.INPUT_MONTH),
                Click.on(ChoucairRegisterPage.INPUT_DAY),
                Click.on(ChoucairRegisterPage.INPUT_YEAR),
                Click.on(ChoucairRegisterPage.SELECT_LANGUAGE),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON0),
                Click.on(ChoucairRegisterPage.INPUT_CITY),
                Enter.theValue("705030").into(ChoucairRegisterPage.INPUT_ZIP),
                Enter.theValue("Colombia").into(ChoucairRegisterPage.SELECT_COUNTRY),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON1),
                Click.on(ChoucairRegisterPage.INPUT_PC),
                Click.on(ChoucairRegisterPage.SELECT_VERSION),
                Click.on(ChoucairRegisterPage.SELECT_LANGUAG),
                Click.on(ChoucairRegisterPage.INPUT_MOVIL),
                Click.on(ChoucairRegisterPage.INPUT_MODEL),
                Click.on(ChoucairRegisterPage.SELECT_OS),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON2),
                Enter.theValue("123456").into(ChoucairRegisterPage.INPUT_PASS),
                Enter.theValue("123456").into(ChoucairRegisterPage.INPUT_CONFIPASS),
                Click.on(ChoucairRegisterPage.INPUT_MODEL),
                Click.on(ChoucairRegisterPage.SELECT_OS),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON3));


    }
}

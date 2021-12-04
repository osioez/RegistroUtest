package co.com.choucair.certification.RegisterUtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairRegisterPage extends PageObject {

    public static final Target joinToday = Target.the("Button that us the form to register")
            .located(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']//a[contains(text(),'Join Today')]"));

    //Pagina1
    public static final Target INPUT_FIRSTNAME = Target.the("Where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Where do we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Where do we write the email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Where do we select the montn")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("Where do we select the day")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("Where do we select the year")
            .located(By.id("birthYear"));

    //public static final Target SELECT_LANGUAGE = Target.the("Select the language").located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));

    public static final Target NEXT_BUTTON0 = Target.the("Next previus page")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));

    //Pagina2
    public static final Target INPUT_CITY = Target.the("Where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("Where do we write the zip code")
            .located(By.id("zip"));

    //public static final Target SELECT_COUNTRY = Target.the("Select the country").located(By.className("ui-select-match"));

    public static final Target NEXT_BUTTON1 = Target.the("Next previus page")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));


    //Pagina3

   //public static final Target INPUT_PC = Target.the("Select you devices").located(By.className("ui-select-match"));
    // public static final Target SELECT_VERSION = Target.the("Select the version").located(By.className("ui-select-match"));
    //public static final Target SELECT_LANGUAG = Target.the("Select the language").located(By.className("ui-select-match-text pull-left ui-select-allow-clear"));

    //public static final Target INPUT_MOVIL = Target.the("Select your mobile device").located(By.className("btn btn-default form-control ui-select-toggle"));

    //public static final Target INPUT_MODEL = Target.the("Select the model").located(By.className("btn btn-default form-control ui-select-toggle"));

    //public static final Target SELECT_OS = Target.the("Select the system operative").located(By.className("ui-select-placeholder text-muted"));

    public static final Target NEXT_BUTTON2 = Target.the("Next previus page")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

    //Pagina4
    public static final Target INPUT_PASS = Target.the("Where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIPASS = Target.the("Where do we rewrite the password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERM = Target.the("confirm the terms")
            .located(By.xpath("//label[@class='input-check-box signup-consent']//input[@id='termOfUse']"));

    public static final Target CHECK_PRIVACY = Target.the("confirm the privacy")
            .located(By.xpath("//label[@class='input-check-box signup-consent']//input[@id='privacySetting']"));

    public static final Target NEXT_BUTTON3 = Target.the("Save")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue']"));


}

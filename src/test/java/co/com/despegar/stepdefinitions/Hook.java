package co.com.despegar.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class Hook {

    @Before
    public static void before() {
        setTheStage(new OnlineCast());
        theActor("Yanyeline");
    }

}

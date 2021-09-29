package co.com.despegar.tasks.common;

import co.com.despegar.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheAplication implements Task {

    HomePage homePage;

    @Step("{0} Opens the web site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(homePage)
        );
    }

    public static OpenTheAplication withUrl() {
        return Tasks.instrumented(OpenTheAplication.class);
    }


}

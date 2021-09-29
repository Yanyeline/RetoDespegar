package co.com.despegar.interactions;

import co.com.despegar.userinterfaces.Flights;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseModal implements Interaction {

    @Step("{0} Close modal on the browser")
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (Flights.BTN_CLOSE_MODAL.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(Flights.BTN_CLOSE_MODAL));
        }

    }

    public static CloseModal onTheBrowser() {
        return instrumented(CloseModal.class);
    }

}

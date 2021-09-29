package co.com.despegar.tasks.bookflight;

import co.com.despegar.interactions.CloseModal;
import co.com.despegar.tasks.common.Wait;
import co.com.despegar.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookFlight implements Task {

    private Map<String, String> data;


    public BookFlight(Map<String, String> dataUser) {

        this.data = dataUser;
    }

    @Step("{0} user book flight")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.Element(HomePage.TAB_ROUN_TRIP),
                Click.on(HomePage.TXT_ORIGIN),
                Enter.theValue(data.get("from")).into(HomePage.TXT_ORIGIN),
                Enter.theValue(data.get("from")).into(HomePage.TXT_ORIGIN),
                Wait.Element(HomePage.DDL_COUNTRIES),
                Click.on(HomePage.DDL_COUNTRIES),
                Click.on(HomePage.TXT_DESTINY),
                Enter.theValue(data.get("toward")).into(HomePage.TXT_DESTINY),
                Enter.theValue(data.get("toward")).into(HomePage.TXT_DESTINY),
                Wait.Element(HomePage.DDL_COUNTRIES),
                Click.on(HomePage.DDL_COUNTRIES),
                Click.on(HomePage.TXT_DATE_GONE),
                Wait.Element(HomePage.CALENDAR.of(data.get("departureMonth"), data.get("departureDay"))),
                Click.on(HomePage.CALENDAR.of(data.get("departureMonth"), data.get("departureDay"))),
                Wait.Element(HomePage.CALENDAR.of(data.get("returnMonth"), data.get("returnDay"))),
                Click.on(HomePage.CALENDAR.of(data.get("returnMonth"), data.get("returnDay"))),
                Click.on(HomePage.BTN_SEARCH_FLIGHT),
                Wait.Element(Flights.OPTION_PRICES_AIRLINE),
                Wait.Element(Flights.BTN_BUY),
                Click.on(Flights.BTN_BUY),
                CloseModal.onTheBrowser()
        );
    }

    public static BookFlight fillFields(Map<String, String> data) {

        return instrumented(BookFlight.class, data);
    }
}

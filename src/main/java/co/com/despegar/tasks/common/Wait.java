package co.com.despegar.tasks.common;

import co.com.despegar.utilities.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Wait implements Task {

    Target Element;

    public Wait(Target element) {
        Element = element;
    }

    @Step("{0} Waiting for items")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Element, isVisible()).forNoMoreThan(Constant.TIMEOUT).seconds()
        );
    }

    public static Wait Element(Target element) {

        return instrumented(Wait.class, element);
    }
}

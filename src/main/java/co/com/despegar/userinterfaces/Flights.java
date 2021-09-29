package co.com.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Flights {

    public static final Target OPTION_PRICES_AIRLINE = Target.the("Option prices by airline").located(By.cssSelector(".-flex.tabs-nav > .airlinePricesMatrix.tabs-nav-item"));
    public static final Target BTN_BUY = Target.the("Buy").locatedBy("(//a//em[contains(text(),'Seleccionar')])[1]");
    public static final Target BTN_CLOSE_MODAL = Target.the("Close modal").located(By.xpath("//button//em[contains(text(),'Continuar')]"));
}

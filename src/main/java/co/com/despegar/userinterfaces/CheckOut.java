package co.com.despegar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOut {

    public static final Target MESSAGE = Target.the("Message validation").located(By.cssSelector(".-eva-3-hide-medium.-eva-3-hide-small.chk-main-title"));
}

package co.com.despegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.despegar.com.co/")
public class HomePage extends PageObject {

    public static final Target TAB_ROUN_TRIP = Target.the("").located(By.cssSelector(".-md.bundle-checked.sbox5-3-radio > .radio-label-container > .radio-circle"));
    public static final Target TXT_ORIGIN = Target.the("Country of origin").located(By.xpath("(//input[@type='text'])[1]"));
    public static final Target DDL_COUNTRIES = Target.the("List of countries").located(By.cssSelector(".ac-group-items > .item"));
    public static final Target TXT_DESTINY = Target.the("Country of destiny").located(By.xpath("(//input[@type='text'])[2]"));
    public static final Target TXT_DATE_GONE = Target.the("Date gone").located(By.xpath("(//input[@type='text'])[3]"));
    public static final Target TXT_RETURN_DATE = Target.the("Return date").located(By.xpath("(//input[@type='text'])[4]"));
    public static final Target CALENDAR = Target.the("Calendar").locatedBy("(//div[contains(text(),'{0}')]//ancestor::div[@class='sbox5-monthgrid']//div[.='{1}'])[1]");
    public static final Target BTN_SEARCH_FLIGHT = Target.the("Search flight").located(By.xpath("//button//em[contains(text(),'Buscar')]"));
}

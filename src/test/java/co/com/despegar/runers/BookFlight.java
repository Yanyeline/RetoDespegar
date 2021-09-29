package co.com.despegar.runers;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.despegar.stepdefinitions"},
        features = {"src/test/resources/features/book_flight.feature"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class BookFlight {
}

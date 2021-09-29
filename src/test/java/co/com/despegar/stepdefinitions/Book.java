package co.com.despegar.stepdefinitions;

import co.com.despegar.questions.CheckMessage;
import co.com.despegar.tasks.bookflight.BookFlight;
import co.com.despegar.tasks.common.OpenTheAplication;
import co.com.despegar.userinterfaces.CheckOut;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class Book {

    @Given("^User is on the home page$")
    public void user_is_on_the_home_page() {
        theActorInTheSpotlight().wasAbleTo(OpenTheAplication.withUrl());
    }

    @When("^User enters the flight information$")
    public void user_enters_the_flight_information(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(BookFlight.fillFields(data));
    }

    @Then("^Book a successful flight and view the message (.*)$")
    public void book_a_successful_flight_and_view_the_message(String message) {
        theActorInTheSpotlight().should(seeThat(CheckMessage.message(CheckOut.MESSAGE), equalTo(message)));
    }

}

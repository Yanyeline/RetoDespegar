package co.com.despegar.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class CheckMessage implements Question<String> {

    private Target message;


    public CheckMessage(Target message) {

        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(message).viewedBy(actor).asString().trim();
    }

    public static CheckMessage message(Target message) {

        return new CheckMessage(message);
    }
}

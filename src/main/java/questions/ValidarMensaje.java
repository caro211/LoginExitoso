package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static java.lang.Boolean.TRUE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.LoginUI.MENSAJE_BIENVENIDA;

public class ValidarMensaje implements Question<Boolean> {

    public static ValidarMensaje usuario() {
        return new ValidarMensaje();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(MENSAJE_BIENVENIDA,isVisible()).forNoMoreThan(2).seconds());
        return TRUE;
    }
}

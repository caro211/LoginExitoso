package tasks;

import models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static ui.LoginUI.*;

public class Login implements Task {

    private LoginModel datosLogin;

    public Login(LoginModel datosLogin) {
        this.datosLogin = datosLogin;
    }

    public static Login App(LoginModel datosLogin) {
        return Tasks.instrumented(Login.class,datosLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Type.theValue(datosLogin.getUsuario()).into(CAMPO_USUARIO),
                Type.theValue(datosLogin.getContrasena()).into(CAMPO_CONTRASEÑA),
                Click.on(BOTON_INICIAR_SESION)
        );


    }
}

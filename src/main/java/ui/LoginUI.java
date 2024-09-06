package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target CAMPO_USUARIO = Target.the("campo usuario").located(By.id("username"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("campo contraseña").located(By.id("password"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Boton iniciar sesion").located(By.id("log-in"));

    public static final Target MENSAJE_BIENVENIDA = Target.the("Mensaje de bienvenida").located(By.id("time"));
}

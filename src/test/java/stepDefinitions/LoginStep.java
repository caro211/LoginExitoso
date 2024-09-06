package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.LoginModel;
import questions.ValidarMensaje;
import tasks.Abrirapp;
import tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {


    @Dado("que carolina abre la app")
    public void queCarolinaAbreLaApp() {
        theActorCalled("Carolina").wasAbleTo(Abrirapp.aHacerTest());
    }

    @Cuando("realiza el login")
    public void realizaElLogin(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(Login.App(LoginModel.setData(dataTable).get(0)));

    }
    @Entonces("Visualiza el mensaje de bienvenida")
    public void visualizaElMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(ValidarMensaje.usuario()));
    }
}

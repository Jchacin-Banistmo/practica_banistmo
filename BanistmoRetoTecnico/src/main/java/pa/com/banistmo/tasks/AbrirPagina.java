package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.banistmo.userinterface.AbrirPaginaUserInterface;

public class AbrirPagina implements Task {

    private AbrirPaginaUserInterface abrirPaginaUserInterface;

    public static AbrirPagina banistmo() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaUserInterface));
    }
}

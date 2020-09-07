package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.DepositosUserInterface;

import static pa.com.banistmo.userinterface.DepositosUserInterface.*;

public class SeleccionarCuentasCorrientes implements Task {

    public static SeleccionarCuentasCorrientes enDepositos() {
        return Tasks.instrumented(SeleccionarCuentasCorrientes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_CUENTAS_CORRIENTES));
    }
}

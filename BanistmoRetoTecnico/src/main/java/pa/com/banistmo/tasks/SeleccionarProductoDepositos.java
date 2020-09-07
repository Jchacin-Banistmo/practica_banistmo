package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.ProductosYServiciosUserInterface;

import static pa.com.banistmo.userinterface.ProductosYServiciosUserInterface.*;

public class SeleccionarProductoDepositos implements Task {


    public static SeleccionarProductoDepositos enProductosEnServicios() {
        return Tasks.instrumented(SeleccionarProductoDepositos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_DEPOSITOS));
    }
}

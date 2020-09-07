package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.TarjetaCreditoUserInterface;




public class SeleccionarTarjetaDeCredito implements Task {

    public static SeleccionarTarjetaDeCredito deProductosYServicios() {
        return Tasks.instrumented(SeleccionarTarjetaDeCredito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TarjetaCreditoUserInterface.LINK_TARJETA_CREDITO));

    }
}

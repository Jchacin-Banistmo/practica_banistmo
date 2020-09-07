package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.TarjetaCreditoUserInterface;

public class VerContratoDeTDC implements Task {

    public static VerContratoDeTDC enPdf() {
        return Tasks.instrumented(VerContratoDeTDC.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TarjetaCreditoUserInterface.LINK_DESCARGA_TDC));
    }
}

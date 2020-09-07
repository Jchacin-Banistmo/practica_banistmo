package pa.com.banistmo.questions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import pa.com.banistmo.interactions.CambiarDePestana;
import pa.com.banistmo.userinterface.TarjetaCreditoUserInterface;

public class SeMuestreELPdfDelContratoTDC implements Question<Boolean> {


    public static SeMuestreELPdfDelContratoTDC enLaPestana() {
        return new SeMuestreELPdfDelContratoTDC();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        actor.attemptsTo(Tasks.instrumented(CambiarDePestana.class));
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        return TarjetaCreditoUserInterface.CONTRATO_TDC_PDF.resolveFor(actor).isPresent();


    }
}

package pa.com.banistmo.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.questions.SeMuestreELPdfDelContratoTDC;
import pa.com.banistmo.questions.SeMuestreLaPaginaCuentaCorriente;
import pa.com.banistmo.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepProductosYServicios {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso la pagina web de Banistmo$")
    public void queIngresoLaPaginaWebDeBanistmo() {
       theActorCalled("Jonathan").wasAbleTo(AbrirPagina.banistmo());
    }

    @Cuando("^abro el contrato de tarjeta de credito$")
    public void abroElContratoDeTarjetaDeCredito() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAProductosYServicios.dePersonas(),
                SeleccionarTarjetaDeCredito.deProductosYServicios(),
                VerContratoDeTDC.enPdf()
        );
    }

    @Entonces("^verifico que se muestre el contrato de TDC en pdf$")
    public void verificoQueSeMuestreElContratoDeTDCEnPdf() {
        theActorInTheSpotlight().should(
                seeThat(SeMuestreELPdfDelContratoTDC.enLaPestana())
        );
    }

    @Cuando("^cuando entro a los productos de Depositos$")
    public void cuandoEntroALosProductosDeDepositos() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAProductosYServicios.dePersonas(),
                SeleccionarProductoDepositos.enProductosEnServicios(),
                SeleccionarCuentasCorrientes.enDepositos()
        );
    }

    @Entonces("^verifico que se muestre la pagina de \"([^\"]*)\"$")
    public void verificoQueSeMuestreLaPaginaDe(String textoCuentaCorriente) {
        theActorInTheSpotlight().should(seeThat(SeMuestreLaPaginaCuentaCorriente.enDeposito(textoCuentaCorriente)));
    }
}


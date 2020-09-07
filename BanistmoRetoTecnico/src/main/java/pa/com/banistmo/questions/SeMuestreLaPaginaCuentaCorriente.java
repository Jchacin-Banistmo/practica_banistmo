package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.CuentasCorrientesUserInterface;

import static pa.com.banistmo.userinterface.CuentasCorrientesUserInterface.*;

public class SeMuestreLaPaginaCuentaCorriente implements Question<Boolean> {
    private String verificaCuentaCorriente;

    public SeMuestreLaPaginaCuentaCorriente(String verificaCuentaCorriente) {
        this.verificaCuentaCorriente = verificaCuentaCorriente;
    }

    public static SeMuestreLaPaginaCuentaCorriente enDeposito(String verificaCuentaCorriente) {
        return new SeMuestreLaPaginaCuentaCorriente(verificaCuentaCorriente);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultadoTextoCuenta;

        String textoCuentaCorriente = Text.of(TEXTO_CUENTAS_CORRIENTE).viewedBy(actor).asString();

        if(verificaCuentaCorriente.equals(textoCuentaCorriente)){
            resultadoTextoCuenta = true;
        }
        else{
            resultadoTextoCuenta = false;
        }

        return resultadoTextoCuenta;
    }
}

package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentasCorrientesUserInterface {

    public static final Target TEXTO_CUENTAS_CORRIENTE = Target.the("texto que identifica la pagina de cuentas corrientes")
            .located(By.xpath("//h1[contains(text(),'Cuentas Corriente')]"));
}

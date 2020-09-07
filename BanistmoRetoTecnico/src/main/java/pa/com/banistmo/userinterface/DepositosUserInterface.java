package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DepositosUserInterface {

    public static final Target LINK_CUENTAS_CORRIENTES = Target.the("link para ingresar aL producto de cuentas corrientes")
            .located(By.xpath("//a[contains(text(),'Cuentas Corrientes')]"));
}

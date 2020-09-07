package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarjetaCreditoUserInterface {

    public static final Target LINK_TARJETA_CREDITO= Target.the("link para ingresar al producto tarjeta de credito")
            .located(By.xpath("//a[contains(text(),'Tarjetas de Crédito')]"));

    public static final Target LINK_DESCARGA_TDC= Target.the("link para descargar contrato TDC")
            .located(By.xpath("//a[contains(text(),'Descargar Contrato de Tarjeta de Crédito')]"));

    public static final Target CONTRATO_TDC_PDF= Target.the("contrato de TDC en pdf")
            .located(By.xpath("//embed[@type='application/pdf']"));

}

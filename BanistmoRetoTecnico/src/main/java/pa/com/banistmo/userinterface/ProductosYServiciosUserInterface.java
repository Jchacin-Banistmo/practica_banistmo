package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosYServiciosUserInterface {

    public static final Target LINK_PRODUCTOS_sERVICIOS = Target.the("link para ingresar a productos y servicios")
            .located(By.xpath("//a[@href='#productosYserviciosPersonas']"));

    public static final Target LINK_DEPOSITOS = Target.the("link para ingresar a productos depositos")
            .located(By.xpath("//a[contains(text(),'Depósitos')]"));
}

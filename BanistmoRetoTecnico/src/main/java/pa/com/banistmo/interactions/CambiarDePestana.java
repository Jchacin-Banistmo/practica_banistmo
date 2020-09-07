package pa.com.banistmo.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.DriverTask;

import java.util.Set;

public class CambiarDePestana implements Interaction  {

    @Override
    public <T extends Actor> void performAs(T actor) {

        Set<String> ventanaId = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String id : ventanaId) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(id);
        }


    }
}

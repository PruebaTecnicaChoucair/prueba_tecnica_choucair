package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FinishPage extends PageObject {
    public static final Target WELCOME_TEXT = Target.the("Welcome text")
            .located(By.xpath("//ui-view/unauthenticated-container/div[@class='unauthenticated-container']/div/div[@id='mainUiView']/ui-view/div[@id='mainContent']/div/div[@class='welcome-page']/div[@class='image-box gradient-cold-hero']/div[@class='image-box-header']/h1"));
}

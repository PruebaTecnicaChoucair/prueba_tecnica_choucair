package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DevicesPage extends PageObject {

    public static final Target INPUT_COMPUTER = Target.the("where do we select the computer")
            .located(By.xpath("//ui-view/main[@class='registration']/section[@id='regs_container']/div[@class='container-fluid']/div[2]/div[@class='sign-up-form-container']/div[@class='ui-view']/div/div[@class='form-group-box']/div[@class='devices-box']/div[@id='web-device']/div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'][1]/div[@class='ui-select-box']/div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid auto-detected']/div[@class='ui-select-match']/span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INPUT_COMPUTER_TEXT =Target.the("where do we write the computer")
            .located(By.xpath("//ui-view/main[@class='registration']/section[@id='regs_container']/div[@class='container-fluid']/div[2]/div[@class='sign-up-form-container']/div[@class='ui-view']/div/div[@class='form-group-box']/div[@class='devices-box']/div[@id='web-device']/div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'][1]/div[@class='ui-select-box']/div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid auto-detected open']/input[@class='form-control ui-select-search ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target BUTTON_NEXT = Target.the("button to fourth step")
            .located(By.xpath("//div[@class='ui-view']//a[@class='btn btn-blue pull-right']"));
}

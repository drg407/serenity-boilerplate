package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class LoginPage extends PageObject {

    public void logIn(){
        $("#login2").click();
        $("#loginusername").sendKeys("asdf");
        $("#loginpassword").sendKeys("asdf");
        $("//button[contains(text(),'Log in')]").click();
    }

    public String welcomeVisible(){
        return $("#nameofuser").getText();
    }
}

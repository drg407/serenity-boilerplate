package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Managed
    WebDriver browser;

    @Test
    public void loginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.logInAsInvalidUser();
        loginPageSteps.userShouldBeOnErrorPage();
    }
}

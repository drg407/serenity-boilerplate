package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage() {
        loginPage.open();
    }

    @Step
    public void logInAsInvalidUser() {
        loginPage.logIn();
    }

    @Step
    public void userShouldBeOnErrorPage() {
        Assert.assertTrue(loginPage.welcomeVisible().contains("Welcome"));
    }
}

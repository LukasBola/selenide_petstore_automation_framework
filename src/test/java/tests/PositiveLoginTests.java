package tests;

import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests {
    LoginPage loginPage = new LoginPage();
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void asUserLogInUsingValidLoginAndPassword() {
        open(LOGIN_URL);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickLoginButton();
        topMenuPage.clickOnSignOutLink();
    }
}

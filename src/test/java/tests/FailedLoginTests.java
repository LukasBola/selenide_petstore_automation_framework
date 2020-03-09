package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests {

    @Test

    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        open(LOGIN_URL);
        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUsernameField("NotExistingLogin");
        loginPage.typeIntoPasswordField("NotProperPassword");
        loginPage.clickLoginButton();
    }
}

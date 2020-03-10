package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests extends TestBase {

    @Issue("DEFECT-1")
    @TmsLink("ID-1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("The goal of this test is to log in using invalid username and password" +
            "and check if warning message is displayed.")
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        open(LOGIN_URL);
        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUsernameField("NotExistingLogin");
        loginPage.typeIntoPasswordField("NotProperPassword");
        loginPage.clickLoginButton();
    }
}

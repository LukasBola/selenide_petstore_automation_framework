package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests {
    LoginPage loginPage = new LoginPage();
    TopMenuPage topMenuPage = new TopMenuPage();

    @Issue("DEFECT-2")
    @TmsLink("ID-2")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("The goal of this test is to log in using valid username and password" +
            "and chceck if Dog banner is diplayd after login on page footer.")
    public void asUserLogInUsingValidLoginAndPassword() {
        open(LOGIN_URL);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickLoginButton();
        topMenuPage.clickOnSignOutLink();
    }
}

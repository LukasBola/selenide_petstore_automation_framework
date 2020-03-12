package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.objects.FooterPage;
import page.objects.LoginPage;
import page.objects.MainPage;
import page.objects.TopMenuPage;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests {
    LoginPage loginPage = new LoginPage();
    TopMenuPage topMenuPage = new TopMenuPage();
    MainPage mainPage = new MainPage();
    SoftAssert soft = new SoftAssert();
    FooterPage footerPage = new FooterPage();

    @Issue("DEFECT-2")
    @TmsLink("ID-2")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("The goal of this test is to log in using valid username and password" +
            "and check if Dog banner is displayed after login on page footer and check if all side bars are displayed.")
    public void asUserLogInUsingValidLoginAndPassword() {
        open(LOGIN_URL);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickLoginButton();

        soft.assertTrue(footerPage.isBannerAfterLoginIsDisplayed());
        soft.assertTrue(mainPage.isFishSidebarVisible());
        soft.assertTrue(mainPage.isDogSidebarVisible());
        soft.assertTrue(mainPage.isCatSidebarsVisible());
        soft.assertTrue(mainPage.isReptilesSidebarVisible());
        soft.assertTrue(mainPage.isBirdsSidebarsVisible());
        soft.assertEquals(5, mainPage.listOfSidebarsDescriptions().size());
        soft.assertAll();
        topMenuPage.clickOnSignOutLink();

    }
}

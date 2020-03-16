package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.objects.FooterPage;
import page.objects.LoginPage;
import page.objects.MainPage;
import page.objects.TopMenuPage;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.LOGIN_URL;

@Listeners(SoftAsserts.class)
public class PositiveLoginTests extends TestBase {
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

        Configuration.assertionMode = SOFT;

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
        soft.assertEquals("<img src=\"../images/fish_icon.gif\">", mainPage.listOfSidebarsDescriptions().get(0).innerHtml());
        soft.assertAll();
        mainPage.listOfSidebarsDescriptions().get(0).shouldHave(Condition.attribute("outerHTML",
                "<a href=\"/jpetstore/actions/Catalog.action?viewCategory=&amp;categoryId=FISH\"" +
                        "><img src=\"../images/fish_icon.gif\"></a>"));
        topMenuPage.clickOnSignOutLink();
        mainPage.dogSidebar.shouldBe(Condition.visible);
        mainPage.catSidebars.shouldBe(Condition.visible);
        mainPage.birdsSidebars.shouldBe(Condition.visible);
    }
}

package tests;

import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import page.objects.*;

import static com.codeborne.selenide.Selenide.open;
import static navigation.ApplicationURLs.APPLICATION_URL;
import static org.testng.Assert.assertEquals;

public class ShoppingCartTests {

    LandingPage landingPage = new LandingPage();
    AngelfishListPage angelfishListPage = new AngelfishListPage();
    FishListPage fishListPage = new FishListPage();
    TopMenuPage topMenuPage = new TopMenuPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    @Issue("DEFECT-3")
    @TmsLink("ID-3")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void addSmallAngelFishToTheCartWithoutLoginIn() {
        open(APPLICATION_URL);
        landingPage.clickOnEnterStoreLink();
        topMenuPage.clickOnQuickFishMenu();
        fishListPage.clickOnAngelFishId();
        angelfishListPage.clickOnSmallAngelFishAddToCartButton();
        shoppingCartPage.clickOnProceedToCheckOutButton();

        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
package page.objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage{

    private SelenideElement
            signInLink = $("#MenuContent a[href*='signonForm']"),
            signOutLink = $("#MenuContent a[href*='signoff']"),
            quickFishMenu = $("#QuickLinks img[src*='fish']"),
            logoImage =  $("#LogoContent");

    @Step("Click on Sing In link at top page menu.")
    public void clickOnSignInLink() {
        signInLink.click();
        log().info("Clicked on Sign In link at Top Page Menu.");
    }

    @Step("Click on Sing out link at top page menu.")
    public void clickOnSignOutLink() {
        signOutLink.click();
        log().info("Clicked on Sign Out link at Top Page Menu.");
    }

    @Step("Click on quick Fish Menu link at the top page menu.")
    public void clickOnQuickFishMenu() {
        quickFishMenu.click();
        log().info("Clicked on quick Fish Menu link at the Top Page Menu.");
    }

    public SelenideElement getLogoImage(){
        return logoImage;
    }
}

package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage {

    private SelenideElement signInLink = $("#MenuContent a[href*='signonForm']");
    private SelenideElement signOutLink = $("#MenuContent a[href*='signoff']");
    private SelenideElement quickFishMenu = $("#QuickLinks img[src*='fish']");

    //    @Step("Click on Sing In link at top page menu.")
    public void clickOnSignInLink() {
        signInLink.click();
//        log().info("Clicked on Sign In link at Top Page Menu.");
    }

    //    @Step("Click on Sing out link at top page menu.")
    public void clickOnSignOutLink() {
        signOutLink.click();
//        log().info("Clicked on Sign Out link at Top Page Menu.");
    }

    public void clickOnQuickFishMenu() {
        quickFishMenu.click();
//        log().info("Clicked on quick Fish Menu link at the Top Page Menu.");
    }
}

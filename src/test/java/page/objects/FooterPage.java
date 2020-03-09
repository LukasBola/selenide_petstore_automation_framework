package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class FooterPage {

    private SelenideElement bannerAfterLogin= $("#Banner img[src*='dog']");

    public boolean isBannerAfterLoginIsDisplayed(){
        boolean isDisplayed = bannerAfterLogin.isDisplayed();
//        log().info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }
}

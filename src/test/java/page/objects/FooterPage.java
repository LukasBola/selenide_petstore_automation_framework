package page.objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;


public class FooterPage extends BasePage{

    private SelenideElement bannerAfterLogin= $("#Banner img[src*='dog']");

    @Step("Checking if Dog Banner is displayd on page footer after log in.")
    public boolean isBannerAfterLoginIsDisplayed(){
        boolean isDisplayed = bannerAfterLogin.isDisplayed();
        log().info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }
}

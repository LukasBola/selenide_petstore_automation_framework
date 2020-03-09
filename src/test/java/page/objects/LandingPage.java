package page.objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage{

    private SelenideElement enterStoreLink = $("#Content a");

    public void clickOnEnterStoreLink() {
        enterStoreLink.click();
//        log().info("Clicked on enter store link.");
    }
}

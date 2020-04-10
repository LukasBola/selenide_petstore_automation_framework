package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage extends BasePage {

    private SelenideElement enterStoreLink = $("#Content a");

    @Step("Click on Enter Store link at Landing Page")
    public void clickOnEnterStoreLink() {
        enterStoreLink.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        log().info("Clicked on enter store link.");
    }
}

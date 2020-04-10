package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class FishListPage extends BasePage {

    private SelenideElement angelFishId = $("#Catalog table a[href*='productId=FI-SW-01']");

    @Step("Click on angelfish at fish list page.")
    public void clickOnAngelFishId() {
        angelFishId.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        log().info("Clicked on Angelfish product Id at Fish list page.");
    }
}

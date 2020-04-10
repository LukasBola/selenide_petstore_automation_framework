package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AngelfishListPage extends BasePage {

    private SelenideElement smallAngelFishAddToCartButton = $("a.Button[href$='EST-2']");

    @Step("Click on small Angelfish at Angelfish list page and clicked on Add to cart button at Angelfish list page.")
    public void clickOnSmallAngelFishAddToCartButton() {
        smallAngelFishAddToCartButton.shouldBe(Condition.enabled).shouldBe(Condition.visible).click();
        log().info("Clicked on small Angelfish at Angelfish list page and clicked on Add to cart button at Angelfish list page.");
    }
}

package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage extends BasePage {


    private SelenideElement proceedToCheckOutButton = $("#Cart a[href*='newOrderForm']");

    @Step("Clicked on Proceed to checkout button at the Shopping cart page.")
    public void clickOnProceedToCheckOutButton() {
        proceedToCheckOutButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
        log().info("Clicked on Proceed to checkout button at the Shopping cart page.");
    }
}

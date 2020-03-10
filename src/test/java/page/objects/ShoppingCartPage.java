package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage extends BasePage{


    private SelenideElement proceedToCheckOutButton=$("#Cart a[href*='newOrderForm']");

    public void clickOnProceedToCheckOutButton() {
        proceedToCheckOutButton.click();
        log().info("Clicked on Proceed to checkout button at the Shopping cart page.");

    }
}

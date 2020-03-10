package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AngelfishListPage extends BasePage {
    private SelenideElement smallAngelFishAddToCartButton = $("a.Button[href$='EST-2']");

    public void clickOnSmallAngelFishAddToCartButton() {
        smallAngelFishAddToCartButton.click();
        log().info("Clicked on small Angelfish at Angelfish list page and clicked on Add to cart button at Angelfish list page.");
    }
}

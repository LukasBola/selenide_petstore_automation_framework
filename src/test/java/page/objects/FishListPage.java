package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FishListPage extends BasePage {

    private SelenideElement angelFishId = $("#Catalog table a[href*='productId=FI-SW-01']");

    public void clickOnAngelFishId() {
        angelFishId.click();
        log().info("Clicked on Angelfish product Id at Fish list page.");
    }
}

package page.objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends BasePage {

    private SelenideElement
            fishSidebar = $("#SidebarContent img[src*='fish']"),
            dogSidebar = $("#SidebarContent img[src*='reptiles']"),
            reptilesSidebar = $("#SidebarContent img[src*='reptiles']"),
            catSidebars = $("#SidebarContent img[src*='cats']"),
            birdsSidebars = $("#SidebarContent img[src*='birds']"),
            myBatisLink = $("#PoweredBy a");

    private ElementsCollection listOfSidebarsDescriptions = $$("#SidebarContent a");

    @Step("Checking if fishSidebar is displayed")
    public boolean isFishSidebarVisible() {
        return fishSidebar.isDisplayed();
    }


    @Step("Checking if dogSidebar is displayed")
    public boolean isDogSidebarVisible() {
        return dogSidebar.isDisplayed();
    }

    @Step("Checking if reptilesSidebar is displayed")
    public boolean isReptilesSidebarVisible() {
        return reptilesSidebar.isDisplayed();
    }

    @Step("Checking if catSidebars is displayed")
    public boolean isCatSidebarsVisible() {
        return catSidebars.isDisplayed();
    }

    @Step("Checking if birdsSidebars is displayed")
    public boolean isBirdsSidebarsVisible() {
        return birdsSidebars.isDisplayed();
    }

    @Step("Checking if myBatisLink is displayed")
    public boolean isMyBatisLinkVisible() {
        return myBatisLink.isDisplayed();
    }

    @Step("Getting fish sidebar text")
    public ElementsCollection listOfSidebarsDescriptions() {
        return listOfSidebarsDescriptions;
    }
}



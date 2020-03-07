package driver.manager;

import io.qameta.allure.Step;

public class DriverUtils {

    @Step("Maximize web browser window.")
    public static void setInitialConfiguration() {
        DriverManager.getWebDriver().manage().window().maximize();
    }

    @Step("Navigate to URL: {pageURL}")
    public static void navigateToPage(String pageURL) {
        DriverManager.getWebDriver().navigate().to(pageURL);
    }
}

package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.selenide.AllureSelenide;

import java.io.IOException;


public class TestBase {
    @BeforeMethod
    public void initialize() throws IOException {
        DOMConfigurator.configure("src/main/resources/log4j2.xml");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        Configuration.startMaximized = false;
        Configuration.holdBrowserOpen = false;
        Configuration.reportsFolder = "allure-results";
        Selenide.clearBrowserCookies();
        System.setProperty("file.encoding", "UTF-8");
    }

    @AfterMethod
    public void tearDown() {
    }
}

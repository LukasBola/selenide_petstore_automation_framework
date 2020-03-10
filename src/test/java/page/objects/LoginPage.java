package page.objects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage extends BasePage{

    private SelenideElement
            usernameField = $("#Catalog input[name*='username']"),
            passwordField = $("#Catalog input[name*='password']"),
            loginButton = $("#Catalog input[name*='signon']"),
            warningMessage = $("#Content li"),
            messageLabel = $("#Content ul[class='messages'] li");


    @Step("Type into User Name Field {username}")
    public void typeIntoUsernameField(String username) {
        usernameField.setValue(username);
        log().info("Typed user name: '{}' in username field.", username);
    }

    @Step("Type into Password Field {password}")
    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.setValue(password);
        log().info("Typed password: '{}' in password field.", password);
    }

    @Step("Click on Login Button")
    public void clickLoginButton() {
        loginButton.click();
        log().info("Clicked Login button at the login page.");
    }

    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        String warningMessageText = warningMessage.getText();
        log().info("Returned warning message: '{}' at the login page", warningMessageText);
        return warningMessageText;
    }

}


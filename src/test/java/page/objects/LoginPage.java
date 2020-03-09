package page.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

//import io.qameta.allure.Step;

public class LoginPage {

    private SelenideElement usernameField = $("#Catalog input[name*='username']");
    private SelenideElement passwordField = $("#Catalog input[name*='password']");
    private SelenideElement loginButton = $("#Catalog input[name*='signon']");
    private SelenideElement warningMessage = $("#Content li");
    private SelenideElement messageLabel = $("#Content ul[class='messages'] li");


    //    @Step("Type into User Name Field {username}")
    public void typeIntoUsernameField(String username) {
        usernameField.setValue(username);
//        log().info("Typed user name: '{}' in username field.", username);
    }

    //    @Step("Type into Password Field {password}")
    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.setValue(password);
//        log().info("Typed password: '{}' in password field.", password);
    }

    //    @Step("Click on Login Button")
    public void clickLoginButton() {
        loginButton.click();
//        log().info("Clicked Login button at the login page.");
    }

    //    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        String warningMessageText = warningMessage.getText();
//        log().info("Returned warning message: '{}' at the login page", warningMessageText);
        return warningMessageText;
    }

}


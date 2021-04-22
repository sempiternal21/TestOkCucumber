package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    SelenideElement loginInput = $(byXpath("//*[@id=\"field_email\"]"));
    SelenideElement passwordInput = $(byXpath("//*[@id=\"field_password\"]"));
    SelenideElement buttonLogin = $(byXpath("//*[contains(@class, 'button-pro __wide')]"));

    public LoginPage(){
        open("https://ok.ru/");
    }

    public void authorization(String login, String password){
        loginInput.setValue(login);
        passwordInput.setValue(password);
        buttonLogin.click();
    }

    public void checkSuccessfulLogged(){
        $(byText("Incorrect username and/or password")).shouldNotBe(exist);
    }

    public void checkUnSuccessfulLogged(){
        buttonLogin.shouldBe(exist);
    }
}

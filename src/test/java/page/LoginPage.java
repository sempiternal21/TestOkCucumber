package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    SelenideElement loginInput = $(byXpath("//*[@id=\"field_email\"]"));
    SelenideElement passwordInput = $(byXpath("//*[@id=\"field_password\"]"));
    SelenideElement buttonLogin = $(byXpath("//*[@id=\"anonymPageContent\"]/div[2]/div/div[3]/form/div[5]/div[1]/input"));

    public void authorization(String login, String password){
        open("https://ok.ru/");
        loginInput.setValue(login);
        passwordInput.setValue(password);
        buttonLogin.click();
    }
}

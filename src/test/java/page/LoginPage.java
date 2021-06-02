package page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        System.setProperty("selenide.headless","true");
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

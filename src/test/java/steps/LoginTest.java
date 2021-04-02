package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import sun.rmi.runtime.Log;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginTest{

    LoginPage loginPage = new LoginPage();

    @After
    public void fff(){
        Selenide.closeWebDriver();
    }

    @Given("I want to log in to my account")
    public void iWantToLogInToMyAccount() {

    }

    @When("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String login, String password) {
        loginPage.authorization(login, password);
    }

    @Then("I have been successfully logged")
    public void iHaveBeenSuccessfullyLogged() {
        loginPage.checkSuccessfulLogged();
    }


    @Then("I couldn't log in")
    public void iCouldnTLogIn() {
        loginPage.checkUnSuccessfulLogged();
    }
}

package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FriendsPage;
import page.MainPage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckCountFriendsTest{

    @When("I go to the friends tab")
    public void iGoToTheFriendsTab() {
        (new MainPage()).goToFriendsTab();
    }

    @Then("I see the number of my friends {string}")
    public void iSeeTheNumberOfMyFriends(String arg0) {
        assertEquals(arg0, (new FriendsPage()).getCountFriends());
    }
}

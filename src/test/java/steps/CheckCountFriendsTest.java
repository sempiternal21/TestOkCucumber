package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import page.FriendsPage;
import page.MainPage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckCountFriendsTest{

    FriendsPage friendsPage = new FriendsPage();

    @When("I go to the friends tab")
    public void iGoToTheFriendsTab() {
        friendsPage = (new MainPage()).goToFriendsTab();
    }

    @Then("I see the number of my friends {string}")
    public void iSeeTheNumberOfMyFriends(String countFriends) {
        assertEquals(countFriends, friendsPage.getCountFriends());
    }
}

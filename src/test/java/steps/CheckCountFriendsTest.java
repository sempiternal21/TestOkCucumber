package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FriendsPage;
import page.MainPage;

import static org.junit.Assert.assertEquals;

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

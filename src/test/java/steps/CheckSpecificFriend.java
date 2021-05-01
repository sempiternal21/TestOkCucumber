package steps;

import io.cucumber.java.en.Then;
import page.FriendsPage;

import static org.junit.Assert.assertTrue;

public class CheckSpecificFriend {

    @Then("The user that the link {string} points to is in my friends")
    public void theUserThatTheLinkPointsToIsInMyFriends(String link) {
        assertTrue((new FriendsPage()).getSpecificFriends(link));
    }
}

package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FriendsPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckSpecificFriend {

    @Then("The user that the link {string} points to is in my friends")
    public void theUserThatTheLinkPointsToIsInMyFriends(String link) {
        assertTrue((new FriendsPage()).getSpecificFriends(link));
    }
}
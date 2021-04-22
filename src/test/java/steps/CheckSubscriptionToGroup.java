package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GroupPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckSubscriptionToGroup {

    @When("I go to the group with URL {string}")
    public void goToGroup(String url){
        open(url);
    }

    @Then("I see that I am a subscriber")
    public void checkSubscription() {
        (new GroupPage()).checkSubscription();
    }
}

package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GroupPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckSubscriptionToGroup {

    @When("I go to the group named {string}")
    public void goToGroup(String groupName){
        open("https://ok.ru/technopolis");
    }

    @Then("I see that I am a subscriber")
    public void checkSubscription() {
        (new GroupPage()).checkSubscription();
    }
}

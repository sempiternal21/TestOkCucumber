package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GroupPage;
import page.GroupsPage;
import page.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckSubscriptionToGroup {

    GroupsPage groupsPage = new GroupsPage();

    @When("I open groups page")
    public void goToGroupsPage() {
        (new MainPage()).goToGroupsPage();
    }

    @And("Search for group {string}")
    public void searchForGroup(String groupName){
        groupsPage.search(groupName);
    }

    @And("I go to the group named {string}")
    public void goToGroup(String groupName){
        groupsPage.goToGroup(groupName);
    }

    @Then("I see that I am a subscriber")
    public void checkSubscription() {
        (new GroupPage()).checkSubscription();
    }
}

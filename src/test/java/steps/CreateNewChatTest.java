package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DialogsPage;
import page.MainPage;

public class CreateNewChatTest{

    DialogsPage dialogsPage = new DialogsPage();

    @When("I go to messages")
    public void iGoToMessages() {
        dialogsPage = (new MainPage()).goToMessagesTab();
    }

    @And("I click on the create chat button")
    public void iClickOnTheCreateChatButton(){
        dialogsPage.hideAlert();
        dialogsPage.clickAddChatsButton();
        dialogsPage.clickAddTextChatButton();
        dialogsPage.clickSubmitButton();
    }

    @Then("I am successfully creating a new empty chat")
    public void iAmSuccessfullyCreatingANewEmptyChat() {
        dialogsPage.checkSuccessCreateChat();
    }
}

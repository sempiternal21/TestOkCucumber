package page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByShadow;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class DialogsPage {

    SelenideElement addChatButton = $(ByShadow.cssSelector("[data-l=\"t, createMenu\"]", "[id=\"msg_layer\"]"));
    SelenideElement addTextChatButton = $(ByShadow.cssSelector("[data-tsid=\"plus_create_chat\"]", "[id=\"msg_layer\"]"));
    SelenideElement submitButton = $(ByShadow.cssSelector("[data-tsid=\"finish_create_chat_button\"]", "[id=\"msg_layer\"]"));
    SelenideElement createdChat = $(ByShadow.cssSelector("[data-tsid=\"created_chat_system_msg\"]", "[id=\"msg_layer\"]"));
    SelenideElement hideAlert = $(ByShadow.cssSelector("[data-tsid=\"chat-search-input\"]", "[id=\"msg_layer\"]"));

    public void clickAddChatsButton(){
        addChatButton.click();
    }
    public void clickAddTextChatButton(){
        addTextChatButton.click();
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public void checkSuccessCreateChat(){
        createdChat.shouldBe(exist);
    }
    public void hideAlert(){
        hideAlert.click();
    }
}

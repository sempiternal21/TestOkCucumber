package page;

import com.codeborne.selenide.selector.ByShadow;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class DialogsPage {
    public void clickAddChatsButton(){
        $(ByShadow.cssSelector("[data-l=\"t, createMenu\"]", "[id=\"msg_layer\"]")).click();
    }
    public void clickAddTextChatButton(){
        $(ByShadow.cssSelector("[data-tsid=\"plus_create_chat\"]", "[id=\"msg_layer\"]")).click();
    }
    public void clickSubmitButton(){
        $(ByShadow.cssSelector("[data-tsid=\"finish_create_chat_button\"]", "[id=\"msg_layer\"]")).click();
    }
    public void checkSuccessCreateChat(){
        $(ByShadow.cssSelector("[data-tsid=\"created_chat_system_msg\"]", "[id=\"msg_layer\"]")).shouldBe(exist);
    }
    public void hideAlert(){
        $(ByShadow.cssSelector("[data-tsid=\"chat-search-input\"]", "[id=\"msg_layer\"]")).click();
    }
}

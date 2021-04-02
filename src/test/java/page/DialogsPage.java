package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;

public class DialogsPage {
    public void clickAddChatsButton(){
        SelenideElement buttonAdd = $(shadowCss("msg-app > main > msg-page > div.messenger_side > msg-chats-panel > msg-toolbar > main > slot > msg-bubble > slot > msg-button", "#msg_layer"));
        buttonAdd.click();
    }
    public void clickAddTextChatButton(){
        SelenideElement buttonCreateChat = $(shadowCss("msg-app > main > msg-page > div.messenger_side > msg-chats-panel > msg-toolbar > main > slot > msg-bubble > div > slot > msg-menu > slot > msg-menu-item:nth-child(1)", "#msg_layer"));
        buttonCreateChat.click();
    }
    public void clickSubmitButton(){
        SelenideElement buttonSubmit = $(shadowCss("msg-app > main > msg-page > msg-page-modal > msg-new-chat > footer > msg-button:nth-child(1)", "#msg_layer"));
        buttonSubmit.click();
    }
    public void successCreateChat(){
        SelenideElement se3 = $(shadowCss("msg-app > main > msg-page > div.messenger_main > msg-chat > main > section > div > msg-message-list > div > div.group > div.control-message > msg-control-message > div > msg-l10n:nth-child(2)", "#msg_layer"));
        se3.shouldBe(exist);
    }
}

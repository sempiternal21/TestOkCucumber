package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;

public class CreateNewChatTest{

    @When("I go to messages")
    public void iGoToMessages() {
        $(byXpath("//*[@id=\"msg_toolbar_button\"]/div[1]")).click();
    }

    @And("I click on the create chat button")
    public void iClickOnTheCreateChatButton(){

        SelenideElement buttonAdd = $(shadowCss("msg-app > main > msg-page > div.messenger_side > msg-chats-panel > msg-toolbar > main > slot > msg-bubble > slot > msg-button", "#msg_layer"));
        buttonAdd.click();

        SelenideElement buttonCreateChat = $(shadowCss("msg-app > main > msg-page > div.messenger_side > msg-chats-panel > msg-toolbar > main > slot > msg-bubble > div > slot > msg-menu > slot > msg-menu-item:nth-child(1)", "#msg_layer"));
        buttonCreateChat.click();

        SelenideElement buttonSubmit = $(shadowCss("msg-app > main > msg-page > msg-page-modal > msg-new-chat > footer > msg-button:nth-child(1)", "#msg_layer"));
        buttonSubmit.click();

        /*SelenideElement buttonAdd = $(shadowCss("msg-app > main > msg-page > div.messenger_side > msg-chats-panel > div > msg-chats-list > msg-chats-list-item:nth-child(2)", "#msg_layer"));
        buttonAdd.click();*/
        /*JavascriptExecutor jse = (JavascriptExecutor)getWebDriver();
        Long b = (Long) jse.executeScript("return document.querySelector('#msg_layer').shadowRoot.querySelector('msg-app > main > msg-page > div.messenger_side > msg-chats-panel > div > msg-chats-list').getElementsByTagName('msg-chats-list-item').length");
        System.out.println(b);*/
        /*Long c = (Long) jse.executeScript("return document.querySelector('#msg_layer').shadowRoot.querySelector('msg-app > main > msg-page > div.messenger_side > msg-chats-panel > div > msg-chats-list').getElementsByTagName('msg-chats-list-item').length");
        System.out.println(c);

        TimeUnit.SECONDS.sleep(10);

        TimeUnit.SECONDS.sleep(5);
        SelenideElement input = $(shadowCss("msg-app > main > msg-page > div.messenger_main > msg-chat > main > section > footer > msg-posting-form > div > div > div.input > msg-input", "#msg_layer"));
        input.click();
        TimeUnit.SECONDS.sleep(5);
        input.sendKeys("dsfsdfdsfs");
        TimeUnit.SECONDS.sleep(5);

        button.click();
        TimeUnit.SECONDS.sleep(1);
        WebElement str = (WebElement)jse.executeScript("return document.querySelector('#msg_layer').shadowRoot.querySelector('msg-app > main > msg-page > div.messenger_side > msg-chats-panel > msg-toolbar > main > slot > msg-bubble > div > slot > msg-menu > slot > msg-menu-item:nth-child(1) > slot > msg-tico > span > slot > msg-l10n')");
        str.click();
        TimeUnit.SECONDS.sleep(1);
        WebElement b = (WebElement)jse.executeScript("return document.querySelector('#msg_layer').shadowRoot.querySelector('msg-app > main > msg-page > msg-page-modal > msg-new-chat > footer > msg-button:nth-child(1) > slot > msg-l10n')");
        b.click();*/
    }

    @Then("I am successfully creating a new empty chat")
    public void iAmSuccessfullyCreatingANewEmptyChat() {
        SelenideElement se3 = $(shadowCss("msg-app > main > msg-page > div.messenger_main > msg-chat > main > section > div > msg-message-list > div > div.group > div.control-message > msg-control-message > div > msg-l10n:nth-child(2)", "#msg_layer"));
        se3.shouldBe(exist);
    }
}

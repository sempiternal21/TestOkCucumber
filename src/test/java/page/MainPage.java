package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    SelenideElement topPanel = $(byXpath("//*[@id=\"topPanel\"]"));
    SelenideElement friendsTabButton = $(byXpath(".//li[@data-l='t,friends']"));
    SelenideElement musicTabButton = $(byXpath(".//li[@data-l='t,music']"));
    SelenideElement messagesTabButton = $(byXpath(".//li[@data-l='t,messages']"));

    public FriendsPage goToFriendsTab(){
        friendsTabButton.click();
        return new FriendsPage();
    }
    public MusicPage goToMusicTab(){
        musicTabButton.click();
        return new MusicPage();
    }
    public DialogsPage goToMessagesTab(){
        messagesTabButton.click();
        return new DialogsPage();
    }
}

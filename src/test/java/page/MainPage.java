package page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public FriendsPage goToFriendsTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,friends']")).click();
        return new FriendsPage();
    }
    public MusicPage goToMusicTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,music']")).click();
        return new MusicPage();
    }
    public DialogsPage goToMessagesTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,messages']")).click();
        return new DialogsPage();
    }
}

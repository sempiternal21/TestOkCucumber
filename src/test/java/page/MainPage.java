package page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void goToFriendsTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,friends']")).click();
    }
    public void goToMusicTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,music']")).click();
    }
    public void goToMessagesTab(){
        $(byXpath("//*[@id=\"topPanel\"]//li[@data-l='t,messages']")).click();
    }
}

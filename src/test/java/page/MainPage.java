package page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public void goToFriendsTab(){
        $(byXpath("//*[@id=\"topPanel\"]/div[2]/div[1]/div/ul/li[4]")).click();
    }
    public void goToMusicTab(){
        $(byXpath("//*[@id=\"topPanel\"]/div[2]/div[1]/div/ul/li[8]")).click();
    }
}

package page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPage {
    public String getCountFriends(){
        return $(byXpath("//*[@id=\"hook_Block_MiddleColumnTopCard_MenuUser\"]/div/a[2]/span")).getText();
    }
}

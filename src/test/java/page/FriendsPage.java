package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionElement;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FriendsPage {

    private final String COUNT_FRIENDS_LOCATOR = "//*[@id=\"hook_Block_MiddleColumnTopCard_MenuUser\"]//*[contains(text(), 'Друзья')]/span";
    private final String FRIEND_LINK_LOCATOR = "//li[@class='ugrid_i']//a[contains(@href,'profile')][@class='user-grid-card_img']";

    public String getCountFriends(){
        return $(byXpath(COUNT_FRIENDS_LOCATOR)).getText();
    }

    public boolean isMyFriend(String href){
        ElementsCollection ce =  $$(byXpath(FRIEND_LINK_LOCATOR));
        String se = ce.get(1).getAttribute("href");

        for (SelenideElement strHref : ce) {
            if(Objects.equals(strHref.getAttribute("href"), href)){
                return true;
            }
        }
        return false;
    }
}

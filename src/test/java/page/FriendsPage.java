package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionElement;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FriendsPage {
    public String getCountFriends(){
        return $(byXpath("//*[@id=\"hook_Block_MiddleColumnTopCard_MenuUser\"]//*[contains(text(), 'Друзья')]/span")).getText();
    }

    public boolean getSpecificFriends(String href){
        ElementsCollection ce =  $$(byXpath("//li[@class='ugrid_i']/div/div/a"));
        String se = ce.get(1).getAttribute("href");

        for (SelenideElement strHref : ce) {
            if(Objects.equals(strHref.getAttribute("href"), href)){
                return true;
            }
        }
        return false;
    }
}

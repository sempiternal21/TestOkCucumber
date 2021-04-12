package page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GroupsPage {

    SelenideElement searchInput = $(byXpath("//*[@id=\"hook_Block_UserGroupSearch2QueryBlock\"]//group-search-input//input"));
    SelenideElement searchInputBtn = $(byXpath("//*[@id=\"hook_Block_UserGroupSearch2QueryBlock\"]//group-search-input//*[contains(@class, 'search-button')]"));


    public void search(String groupName) {
        searchInput.click();
        searchInput.setValue(groupName);
        searchInputBtn.click();
    }

    public void goToGroup(String groupName){
        $(byXpath("//*[@id=\"userGroupsSearchResultList\"]//a[.=\"" + groupName + "\"]")).click();
    }

}
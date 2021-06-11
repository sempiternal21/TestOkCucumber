package page;

import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage {

    private final String IS_IN_GROUP_LOCATOR = "//*[contains(@class, 'dropdown __wide')]/span";

    SelenideElement firstPost = $(byXpath("//*[@class='feed-list']/*[@class='feed-w'][1]"));
    SelenideElement firstPostLikeWidget = firstPost.$(byXpath(".//*[@data-like-tx=\"Класс!\"]"));


    public int getLikeCount() {
        return Integer.parseInt(
                Objects.requireNonNull(firstPostLikeWidget.getAttribute("data-count"))
        );
    }

    public void toggleLikeFirstPost(){
        firstPostLikeWidget.click();
    }

    public boolean isLikeWidgetActive() {
        return (
            Objects.equals(firstPostLikeWidget.getAttribute("data-l"), "t,unlike")
        );
    }

    public void checkSubscription() {
        $(byXpath(IS_IN_GROUP_LOCATOR)).shouldHave(text("В группе"));
    }
}

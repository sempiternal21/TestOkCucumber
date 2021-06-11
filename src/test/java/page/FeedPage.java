package page;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class FeedPage {
    private final String FEED_LIST_LOCATOR = "//*[@class='feed-list']";
    private final String FEED_ITEM_LOCATOR = "//*[@class='feed-w']";

    public int countFeedItems() {
        return $$(byXpath(FEED_ITEM_LOCATOR)).size();
    }

    public void scrollDownThePage() {
        $(byXpath(FEED_LIST_LOCATOR)).scrollIntoView(false);
        Selenide.sleep(10000);
    }
}

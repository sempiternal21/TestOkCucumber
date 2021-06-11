package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.FeedPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class ScrollFeedPageTest {

    FeedPage feedPage = new FeedPage();
    private int baseFeedItemsCount;

    @When("I go to feed page")
    public void openFeedPage() {
        open("https://ok.ru/feed");
        baseFeedItemsCount = feedPage.countFeedItems();
    }

    @And("I scroll the page down")
    public void scrollDown() {
        feedPage.scrollDownThePage();
    }

    @Then("I see, that more news were loaded")
    public void checkNewPostsLoaded() {
        int newCount = feedPage.countFeedItems();
        assertTrue(newCount > baseFeedItemsCount);
    }
}

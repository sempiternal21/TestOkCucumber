package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GroupPage;
import page.MainPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LikeTest {

    GroupPage groupPage = new GroupPage();
    private final int likesCountBefore = groupPage.getLikeCount();
    private int likesCountAfter;

    @And("I like first post")
    public void likeFirstPost() {
        groupPage.toggleLikeFirstPost();
        likesCountAfter = groupPage.getLikeCount();
    }

    @Then("I see, that post was liked")
    public void checkLike(){
        assertTrue(
            groupPage.isLikeWidgetActive() &&
                    (likesCountAfter - likesCountBefore) == 1
        );
    }

    @When("I remove like from first post")
    public void removeLike() {
        groupPage.toggleLikeFirstPost();
        likesCountAfter = groupPage.getLikeCount();
    }

    @Then("I see, that like was removed")
    public void checkRemovingLike(){
        assertTrue(
                !groupPage.isLikeWidgetActive() &&
                        (likesCountAfter - likesCountBefore) == 0
        );
    }
}

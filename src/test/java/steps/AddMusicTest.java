package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import page.MusicPage;

public class AddMusicTest {
    MusicPage musicPage = new MusicPage();

    @When("I go to the music tab")
    public void iGoToTheMusicTab() {
        (new MainPage()).goToMusicTab();
    }

    @And("I type in the search {string} by {string}")
    public void iTypeInTheSearchBy(String title, String artist) {
        musicPage.findMusic(title, artist);
    }

    @And("I click on the track")
    public void iClickOnTheTrack() {
        musicPage.clickOnTheTrack();
    }

    @And("I click on the add music icon")
    public void iClickOnTheAddMusicIcon() {
        musicPage.addTrackToMyMusic();
    }

    @Then("I see an alert that the music has been added")
    public void iSeeAnAlertThatTheMusicHasBeenAdded() {
        musicPage.trackAddedSuccessfully();
    }



}

package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MusicPage {

    private final String SEARCH_LOCATOR = "//input[@placeholder='Поиск']";
    private final String SUBMIT_LOCATOR = "//wm-search-input//wm-icon[contains(@class, 'submit')]";
    private final String FIRST_TRACK_LOCATOR = "(//wm-track//slot[@name='title'])[1]";
    private final String ADD_TRACK_LOCATOR = "//wm-track-add-button";
    private final String FIRST_TRACK_AUTHOR_LOCATOR = "(//wm-track//slot[@name='info' and not(@class='info')])[1]";
    private final String MUSIC_LIB_LOCATOR = "//wm-nav//a[@data-l='t,library']";

    String authorLastAddedTrack;
    String titleLastAddedTrack;

    public void findMusic(String title, String artist){

        titleLastAddedTrack = title;
        authorLastAddedTrack = artist;

        $(byXpath(SEARCH_LOCATOR)).setValue(title + " " + artist);
        $(byXpath(SUBMIT_LOCATOR)).click();

    }

    public void clickOnTheFirstTrack(){
        $(byXpath(FIRST_TRACK_LOCATOR)).click();
    }

    public void addTrackToMyMusic(){
        $(byXpath(ADD_TRACK_LOCATOR)).click();
    }

    public void goToMyMusicLibrary(){
        $(byXpath(MUSIC_LIB_LOCATOR)).click();
    }

    public void checkTrackAddedSuccessfully(String title, String artist){
        $(byXpath(FIRST_TRACK_LOCATOR)).shouldBe(text(titleLastAddedTrack));
        $(byXpath(FIRST_TRACK_AUTHOR_LOCATOR)).shouldBe(text(authorLastAddedTrack));
    }
}

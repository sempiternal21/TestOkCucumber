package page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MusicPage {

    String authorLastAddedTrack;
    String titleLastAddedTrack;

    public void findMusic(String title, String artist){

        titleLastAddedTrack = title;
        authorLastAddedTrack = artist;

        $(byXpath("//input[@placeholder='Поиск']")).setValue(title + " " + artist);
        $(byXpath("//wm-search-input//wm-icon[contains(@class, 'submit')]")).click();

    }

    public void clickOnTheTrack(){
        $(byXpath("(//wm-track//slot[@name='title'])[1]")).click();
        $(byXpath("(//wm-track//slot[@name='title'])[1]")).click();
    }

    public void addTrackToMyMusic(){
        $(byXpath("//wm-track-add-button")).click();
    }

    public void goToMyMusicLibrary(){
        $(byXpath("//wm-nav//a[@data-l='t,library']")).click();
    }

    public void checkTrackAddedSuccessfully(){
        $(byXpath("(//wm-track//slot[@name='title'])[1]")).shouldBe(text(titleLastAddedTrack));
        $(byXpath("(//wm-track//slot[@name='info' and not(@class='info')])[1]")).shouldBe(text(authorLastAddedTrack));
    }
}

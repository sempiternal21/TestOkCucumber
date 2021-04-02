package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MusicPage {
    public void findMusic(String arg0){
        $(byXpath("//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input/input")).setValue(arg0);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(byXpath("//*[@id=\"music_layer\"]/header/div/wm-search-form/wm-search-input/input")).sendKeys(Keys.ENTER);
    }

    public void clickOnTheTrack(){
        $(byXpath("//*[@id=\"music_layer\"]/main/div/search-page/wm-portlet/slot/wm-tracks-list/main/wm-track[1]/slot[2]/wm-card-details/slot[2]")).click();
        $(byXpath("//*[@id=\"music_layer\"]/main/div/search-page/wm-portlet/slot/wm-tracks-list/main/wm-track[1]/slot[2]/wm-card-details/slot[2]")).click();
    }

    public void addTrackToMyMusic(){
        $(byXpath("//*[@id=\"music_layer\"]/header/wm-player/div/wm-player-actions/wm-track-add-button")).click();
    }

    public void trackAddedSuccessfully(){
        $(byXpath("//*[@id=\"music_layer\"]/wm-toast/slot")).shouldBe(exist);
    }
}

package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage {
    public void checkSubscription() {
        $(byXpath("//*[@id=\"hook_Block_AltGroupMainMenu\"]/ul/div/div/span")).shouldHave(text("В группе"));
    }
}

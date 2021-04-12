package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage {
    public void checkSubscription() {
        $(byXpath("//*[contains(@class, 'dropdown __wide')]/span")).shouldHave(text("В группе"));
    }
}

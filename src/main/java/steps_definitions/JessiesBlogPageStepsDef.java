package steps_definitions;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selenide.$;

public class JessiesBlogPageStepsDef {
    private static final By SUGGESTED_POST_BANNER = By.cssSelector(".el-title.uk-h1 > a");

    @И("^нажимаем на баннер \"Давно просил домашнее животное\"$")
    public void goToSuggestedPost() {
        $(SUGGESTED_POST_BANNER).click();
    }
}

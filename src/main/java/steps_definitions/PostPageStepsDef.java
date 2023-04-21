package steps_definitions;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selenide.$;

public class PostPageStepsDef {
    public static final By POST_TITLE = By.cssSelector("h1[class*=uk-scrollspy-inview]");

    @И("^проверяем название статьи \"(.*)\" на открывшейся странице$")
    public void checkPostTitle(String expectedTitle) {
        $(POST_TITLE).shouldHave(Condition.text(expectedTitle));
    }
}

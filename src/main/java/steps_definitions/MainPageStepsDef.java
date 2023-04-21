package steps_definitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageStepsDef {
    private static final By JESSIES_BLOG_BUTTON = By.cssSelector(".uk-navbar-nav [href=\"/index.php/news\"]");

    private static final By FOOTER_FORM_NAME_FIELD = By.cssSelector("[name=mod_rscontact_full_name]");
    private static final By FOOTER_FORM_EMAIL_FIELD = By.cssSelector("[name=mod_rscontact_email]");
    private static final By FOOTER_FORM_PHONE_FIELD = By.cssSelector("[name=mod_rscontact_mobile_phone]");
    private static final By FOOTER_FORM_SUBJECT_FIELD = By.cssSelector("[name=mod_rscontact_subject]");
    private static final By FOOTER_FORM_BUTTON = By.cssSelector("[type=submit]");
    private static final By FOOTER_FORM_ERROR_MESSAGE = By.cssSelector("[id=\"mod-rscontact-error-msg-91\"]");

    @И("^открываем главную страницу$")
    public void openPage() {
        open("https://qahacking.guru/");
    }

    @И("^переходим в Блог Джесси$")
    public void goToJessiesBlog() {
        $(JESSIES_BLOG_BUTTON).click();
    }

    @И("^заполняем форму \"Спросите нас о собачках\" в футере$")
    public void fillFeedbackForm() {
        $(FOOTER_FORM_NAME_FIELD).sendKeys("Тест Тестовый");
        $(FOOTER_FORM_EMAIL_FIELD).sendKeys("test@mail.ru");
        $(FOOTER_FORM_PHONE_FIELD).sendKeys("89007773322");
        $(FOOTER_FORM_SUBJECT_FIELD).sendKeys("Тест");
    }

    @И("^нажимаем на кнопку под формой$")
    public void clickSendFeedbackFormBtn() {
        $(FOOTER_FORM_BUTTON).click();
    }

    @И("^проверяем успешность отправки формы$")
    public void checkFeedbackFormHasBeenSent() {
        $(FOOTER_FORM_ERROR_MESSAGE).shouldHave(Condition.attribute("style", "display: none;"), Duration.ofSeconds(10));
    }
}

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class TestUI {
    SelenideElement news = $x("//div[@id='floatmenu']/ul/li[1]/a");
    SelenideElement aboutProgram = $x("//div[@id='floatmenu']/ul/li[2]/a");
    SelenideElement feedback = $x("//div[@id='floatmenu']/ul/li[3]/a");
    SelenideElement articles = $x("//div[@id='floatmenu']/ul/li[4]/a");
    SelenideElement conditions = $x("//div[@id='floatmenu']/ul/li[5]/a");
    SelenideElement contacts = $x("//div[@id='floatmenu']/ul/li[6]/a");
    SelenideElement statusPanel = $x("//div[@id='status-panel']");

    @Test
    public void openNews() {
        open("https://sitechco.ru/");
        element(news).click();
        element(statusPanel).shouldHave(text("Sitechco.ru"));
    }

    @Test
    public void openAboutProgram()  {
        open("https://sitechco.ru/");
        element(aboutProgram).click();
        element(statusPanel).shouldHave(text("О Программе"));
    }

    @Test
    public void openFeedback()  {
        open("https://sitechco.ru/");
        element(feedback).click();
        element(statusPanel).shouldHave(text("Отзывы"));
    }

    @Test
    public void openArticles()  {
        open("https://sitechco.ru/");
        element(articles).click();
        element(statusPanel).shouldHave(text("Статьи"));
    }

    @Test
    public void openConditions()  {
        open("https://sitechco.ru/");
        element(conditions).click();
        element(statusPanel).shouldHave(text("Условия"));
    }

    @Test
    public void openContacts()  {
        open("https://sitechco.ru/");
        element(contacts).click();
        element(statusPanel).shouldHave(text("Контакты"));
    }
}

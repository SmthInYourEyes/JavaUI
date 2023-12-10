
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Boolean.TRUE;



public class TestUI {
   SelenideElement news = $x("//*[@id='floatmenu']/ul/li[1]/a");
    SelenideElement aboutProgram = $x("//*[@id='floatmenu']/ul/li[2]/a");
    SelenideElement feedback = $x("//*[@id='floatmenu']/ul/li[3]/a");
    SelenideElement articles = $x("//*[@id='floatmenu']/ul/li[4]/a");
    SelenideElement conditions = $x("//*[@id='floatmenu']/ul/li[5]/a");
    SelenideElement contacts = $x("//*[@id='floatmenu']/ul/li[6]/a");
    SelenideElement statusPanel = $x("//*[@id=\"status-panel\text()]");


@Test
    public void openAboutProgram()  {
    Configuration.holdBrowserOpen = TRUE;
    Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
    @Test
    public void openNews()  {
        Configuration.holdBrowserOpen = TRUE;
        Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
    @Test
    public void openFeedback()  {
        Configuration.holdBrowserOpen = TRUE;
        Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
    @Test
    public void openArticles()  {
        Configuration.holdBrowserOpen = TRUE;
        Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
    @Test
    public void openConditions()  {
        Configuration.holdBrowserOpen = TRUE;
        Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
    @Test
    public void openContacts()  {
        Configuration.holdBrowserOpen = TRUE;
        Configuration.browserSize ="1920x1080";
        Selenide.open("https://sitechco.ru/");
        element(aboutProgram).click();
    }
}

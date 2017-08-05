package my.autotests.gui;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class YandexTest {
    @Before
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedriver\\chromedriver.exe");

    }


    @Test
    public void openYandex() throws Exception {
        open("http://yandex.ru");
        $("#text").setValue("123321").pressEnter();
        String s = String.valueOf($$(".serp-adv__found"));
        assertTrue(s.contains("млн") || s.contains("тыс"));

    }
}

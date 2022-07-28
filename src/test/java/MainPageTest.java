import org.junit.Before;
import com.yandex.praktikum.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPageTest {
    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    public void checkClickBtnPersonalCabinet() {
        MainPage mainpage = open(MainPage.URL_MAIN_PAGE, MainPage.class);
        mainpage.clickBtnPersonalCabinet();
        //Thread.sleep(1000);
    }

}


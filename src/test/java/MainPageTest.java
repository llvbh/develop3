import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.yandex.praktikum.LoginPage;
import org.junit.Before;
import com.yandex.praktikum.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    MainPage mainpage = open(MainPage.URL_MAIN_PAGE, MainPage.class);
    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");

    }
    //Войти в Личный кабинет
    @Test
    public void checkLoginFromBtnPersonalCabinet() throws InterruptedException {
        mainpage.clickBtnPersonalCabinet()
         .setEmail("spring42@gmail.com")
         .setPass("123g4567")
         .clickSave()
         .checkLoginText();
       Thread.sleep(5000);
    }

    //Войти в аккаунт
    @Test
    public void checkLoginFromBtnFromLoginAccount() throws InterruptedException {
        mainpage.clickBtnLoginAccount()
        .setEmail("spring42@gmail.com")
        .setPass("123g4567")
        .clickSave()
        .checkLoginText();
    }
    //Переход в личный кабинет
    @Test
    public void checkBtnPersonalCabinet() throws InterruptedException {
        mainpage.clickPersonalCabinet()
                .checkText();
    }

}






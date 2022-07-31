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
    public void checkLoginFromBtnPersonalCabinet() {
        mainpage.clickBtnPersonalCabinet()
                .setEmail("spring42@gmail.com")
                .setPass("123g4567")
                .clickLogInSave()
                .checkUserLogIn()
                .clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    //Войти в аккаунт
    @Test
    public void checkLoginFromBtnFromLoginAccount(){
        mainpage.clickBtnLoginAccount()
                .setEmail("spring42@gmail.com")
                .setPass("123g4567")
                .clickLogInSave()
                .checkUserLogIn()
                .clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }
    //Переход в личный кабинет
    @Test
    public void checkBtnPersonalCabinet(){
        mainpage.clickBtnPersonalCabinet()
                .checkText();
    }
}





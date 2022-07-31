import com.yandex.praktikum.LoginPage;
import com.yandex.praktikum.MainPage;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageTest {
    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);
    MainPage mainpage = open(MainPage.URL_MAIN_PAGE, MainPage.class);
    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    public void checkClickLogoTest(){
        loginPage.clickLogo();
    }
    @Test
    public void checkClickConstructorTest(){
        loginPage.clickConstructor();
    }

    @Test
    public void checkLoginTest() throws InterruptedException {
        mainpage
            .clickBtnPersonalCabinet()
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickLogInSave()
                .checkUserLogIn()
                .clickBtnAuthPersonalCabinet()
                .clickExitBtn() ;
        Thread.sleep(7000);
    }

    @Test
    public void checkLoginResgistrationTest() {
        mainpage
            .clickBtnPersonalCabinet()
            .clickRegistration()
            .clickLogInRegistration()
            .setPass("123456")
            .setEmail("spring@gmail.com")
            .clickLogInSave()
            .checkUserLogIn()
            .clickBtnAuthPersonalCabinet()
            .clickExitBtn();
    }
    @Test
    public void checkClickForgetPassTest() {
        mainpage
            .clickBtnPersonalCabinet()
            .clickRestorePasswordRegistration()
            .clickLogInRegistration()
            .setPass("123456")
            .setEmail("spring@gmail.com")
            .clickLogInSave()
            .checkUserLogIn()
            .clickBtnAuthPersonalCabinet()
            .clickExitBtn();
    }

}

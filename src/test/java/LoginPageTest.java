import com.yandex.praktikum.LoginPage;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {

    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

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
    public void checkLoginTest() {
        loginPage
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickLogInSave()
                .checkUserLogIn()
                .clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    @Test
    public void checkLoginResgistrationTest() {
        loginPage
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
        loginPage
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

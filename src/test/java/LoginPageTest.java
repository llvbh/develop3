import com.yandex.praktikum.LoginPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {

    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @DisplayName("Клик по лого")
    @Test
    public void checkClickLogoTest(){
        loginPage.clickLogo();
    }

    @DisplayName("Клик по лого конструктора")
    @Test
    public void checkClickConstructorTest(){
        loginPage.clickConstructor();
    }

    @DisplayName("Логин")
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

    @DisplayName("Логин через форму регистрации")
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

    @DisplayName("Логин через форму забыли пароль")
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

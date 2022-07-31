import com.yandex.praktikum.LoginPage;
import com.yandex.praktikum.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class LoginPageTest {

    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @DisplayName("Клик по лого")
    @Test
    public void checkClickLogoTest(){
        boolean hasMakeBurgerText = loginPage.clickLogo();
        assertTrue("Нет переключения на стр конструктора", hasMakeBurgerText);
    }

    @DisplayName("Клик по лого конструктора")
    @Test
    public void checkClickConstructorTest(){
        boolean hasMakeBurgerText = loginPage.clickConstructor();
        assertTrue("Нет переключения на стр конструктора", hasMakeBurgerText);
    }

    @DisplayName("Логин")
    @Test
    public void checkLoginTest() {
        MainPage mainPage = loginPage
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickLogInSave();

        boolean hasCreateOrderText = mainPage.checkUserLogIn();
        assertTrue("Юзер не залогинен", hasCreateOrderText);

        mainPage.clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    @DisplayName("Логин через форму регистрации")
    @Test
    public void checkLoginResgistrationTest() {
        MainPage mainPage = loginPage
            .clickRegistration()
            .clickLogInRegistration()
            .setPass("123456")
            .setEmail("spring@gmail.com")
            .clickLogInSave();

        boolean hasCreateOrderText = mainPage.checkUserLogIn();
        assertTrue("Юзер не залогинен", hasCreateOrderText);

        mainPage.clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    @DisplayName("Логин через форму забыли пароль")
    @Test
    public void checkClickForgetPassTest() {
        MainPage mainPage = loginPage
            .clickRestorePasswordRegistration()
            .clickLogInRegistration()
            .setPass("123456")
            .setEmail("spring@gmail.com")
            .clickLogInSave();

        boolean hasCreateOrderText = mainPage.checkUserLogIn();
        assertTrue("Юзер не залогинен", hasCreateOrderText);

        mainPage.clickBtnAuthPersonalCabinet()
            .clickExitBtn();
    }
}

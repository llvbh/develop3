import com.yandex.praktikum.LoginPage;
import com.yandex.praktikum.MainPage;
import com.yandex.praktikum.RegistrationPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageTest {
    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    public void checkClickLogoTest() throws InterruptedException {
        loginPage
                .clickLogo();
        Thread.sleep(5000);
    }
    @Test
    public void checkClickConstructorTest() throws InterruptedException {
        loginPage
                .clickConstructor();
        Thread.sleep(5000);
    }
    //нажать на кнопку Выход
    //вопрос ??????
    public MainPage clickBtnCookie() {
        loginPage.clickExitBtn();
        return page(MainPage.class);
    }
    @Test
    public void checkLoginTest() throws InterruptedException {
        loginPage
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickSave();
        Thread.sleep(1000);
    }

    @Test
    public void checkLoginResgistrationTest() throws InterruptedException {
        loginPage
                .clickRegistration()
                .clickLogInRegistration()
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickSave()
                .checkLoginText();
        Thread.sleep(9000);
    }
    @Test
    public void checkClickForgetPassTest() throws InterruptedException {
        loginPage
                .clickRestorePasswordRegistration()
                .clickLogInRegistration()
                .setPass("123456")
                .setEmail("spring@gmail.com")
                .clickSave()
                .checkLoginText();
        Thread.sleep(8000);
    }

}


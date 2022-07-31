import com.yandex.praktikum.LoginPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class RegistrationPageTest {
    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @DisplayName("Успешная регистрация")
    @Test
    public void checkRegistrationTrueTest() {
        boolean hasLoginText = loginPage
                .clickRegistration()
                .setName("Name123")
                .setEmail("spring77@gmail.com")
                .setPass("123g4567")
                .clickSave()
                .checkText();
        assertTrue("Нет переключения на стр авторизации", hasLoginText);
    }

    @DisplayName("Войти через ссылку Регистрация с маленьким размером пароля")
    @Test
    public void checkRegistrationFailTest(){
        boolean hasIncorrectPasswordText = loginPage
                .clickRegistration()
                .setName("Nameff")
                .setEmail("spring988@gmail.com")
                .setPass("123")
                .checkRegistrationFail();
        assertTrue("Длина размера пароля меньше 6", hasIncorrectPasswordText);
    }
}
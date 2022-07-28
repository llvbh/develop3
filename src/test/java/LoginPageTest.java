import com.yandex.praktikum.LoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {
    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    public void checkLoginTest() throws InterruptedException {
        LoginPage loginPage = open(LoginPage.URL_PRIVATE_OFFICE_PAGE, LoginPage.class)
        .setPass("123456")
        .setEmail("Beckham")
        .login();
        Thread.sleep(5000);
    }
}

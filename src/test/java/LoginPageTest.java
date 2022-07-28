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
        .setEmail("spring@gmail.com")
        .clickSave();
        Thread.sleep(1000);
    }

    @Test
    public void checkClickLogoTest() throws InterruptedException {
         open(LoginPage.URL_PRIVATE_OFFICE_PAGE, LoginPage.class)
                .clickLogo();
        Thread.sleep(5000);
    }
    @Test
    public void checkClickConstructorTest() throws InterruptedException {
        open(LoginPage.URL_PRIVATE_OFFICE_PAGE, LoginPage.class)
                .clickConstructor();
        Thread.sleep(5000);
    }
}


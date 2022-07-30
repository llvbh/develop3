import com.yandex.praktikum.LoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationPageTest {
    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }
    @Test
    public void checkRegistrationTest() throws InterruptedException {
        loginPage
                .clickRegistration()
                .setName("Nameff")
                .setEmail("spring42@gmail.com")
                .setPass("123g4567")
                .clickSave()
                .checkText();
        Thread.sleep(8000);
    }

    @Test
    public void checkRegistrationFailTest() throws InterruptedException {
        loginPage
                .clickRegistration()
                .setName("Nameff")
                .setEmail("spring442@gmail.com")
                .setPass("123")
                .checkRegistrationFail();
        Thread.sleep(8000);
    }
}

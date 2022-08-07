import api.UserClient;
import com.yandex.praktikum.LoginPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojo.ResponseUser;
import pojo.User;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class RegistrationPageTest {
   LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);
    private User user;
    private static String accessToken;

    @Before
    public void setUp() {
        System.setProperty("selenide.browser", "chrome");
        user = new User("Nazym7777@apple.com", "Nazym7", "55555");
    }

    @AfterClass
    public static void deleteUser() {
        System.out.println(accessToken);
        if (accessToken != null ) {
            UserClient.deleteUser(accessToken);
        }
    }
    @Test
    @DisplayName("Успешная регистрация через АПИ")
    public void checkCreateNewUser() {
        ResponseUser createUser = UserClient.createUser(user);
        Assert.assertTrue(createUser.isSuccess());
        accessToken = createUser.getAccessToken().substring("Bearer".length() + 1);
    }

    @DisplayName("Регистрация с маленьким размером пароля")
    @Test
    public void checkRegistrationFailTest(){
        boolean hasIncorrectPasswordText = loginPage
                .clickRegistration()
                .setName("Name888")
                .setEmail("spring988@gmail.com")
                .setPass("123")
                .checkRegistrationFail();
        assertTrue("Длина размера пароля меньше 6", hasIncorrectPasswordText);
    }
//
//    @DisplayName("Успешная регистрация")
//    @Test
//    public void checkRegistrationTrueTest() {
//        boolean hasLoginText = loginPage
//                .clickRegistration()
//                .setName("Name123678")
//                .setEmail("spring77@gmail.com")
//                .setPass("123g4567")
//                .clickSave()
//                .checkText();
//        assertTrue("Нет переключения на стр авторизации", hasLoginText);
//    }
}
import com.yandex.praktikum.LoginPage;
import com.yandex.praktikum.MainPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class LinksTransitionsTest {
    MainPage mainpage = open(MainPage.URL_MAIN_PAGE, MainPage.class);
    LoginPage loginPage = open(LoginPage.URL_ACCOUNT_PAGE, LoginPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @DisplayName("Переход в личный кабинет")
    @Test
    public void checkBtnPersonalCabinet(){
        boolean hasLoginText = mainpage.clickBtnPersonalCabinet()
                .checkText();
        assertTrue("Нет переключения на стр авторизации", hasLoginText);
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
}

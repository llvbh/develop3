import org.junit.Before;
import com.yandex.praktikum.MainPage;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

import io.qameta.allure.junit4.DisplayName;

public class MainPageTest {
    MainPage mainpage = open(MainPage.URL_MAIN_PAGE, MainPage.class);

    @Before
    public void startUp() {
        System.setProperty("selenide.browser", "chrome");
    }

    @Test
    @DisplayName("Войти в Личный кабинет")
    public void checkLoginFromBtnPersonalCabinet() {
        boolean hasCreateOrderText = mainpage.clickBtnPersonalCabinet()
                .setEmail("spring42@gmail.com")
                .setPass("123g4567")
                .clickLogInSave()
                .checkUserLogIn();
        assertTrue("Юзер не залогинен", hasCreateOrderText);

        mainpage.clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    @DisplayName("Войти в аккаунт")
    @Test
    public void checkLoginFromBtnFromLoginAccount(){
        boolean hasCreateOrderText = mainpage.clickBtnLoginAccount()
                .setEmail("spring42@gmail.com")
                .setPass("123g4567")
                .clickLogInSave()
                .checkUserLogIn();
        assertTrue("Юзер не залогинен", hasCreateOrderText);

        mainpage.clickBtnAuthPersonalCabinet()
                .clickExitBtn();
    }

    @DisplayName("Переход в личный кабинет")
    @Test
    public void checkBtnPersonalCabinet(){
        boolean hasLoginText = mainpage.clickBtnPersonalCabinet()
                .checkText();
        assertTrue("Нет переключения на стр авторизации", hasLoginText);
    }

    @Test
    @DisplayName("Успешный переход к блоку начинки")
    public void checkSwitchToToppingsSectionTest() {
        mainpage.clickToppingsTab();
        boolean isFillingsTabActive = mainpage.isFillingsTabActive();
        assertTrue("Нет переключения на раздел Начинки при клике на таб Начинки", isFillingsTabActive);
    }

    @Test
    @DisplayName("Успешный переход к блоку начинки")
    public void checkSwitchToBunsSectionTest() {
        mainpage.clickBunsTab();
        boolean isBunsTabActive = mainpage.isBunsTabActive();
        assertTrue("Нет переключения на раздел Булки при клике на таб Булки", isBunsTabActive);
    }

    @Test
    @DisplayName("Успешный переход к блоку начинки")
    public void checkSwitchToSaucesSectionTest() {
        mainpage.clickSauceTab();
        boolean isSaucesTabActive = mainpage.isSaucesTabActive();
        assertTrue("Нет переключения на раздел Соусы при клике на таб Соусы", isSaucesTabActive);
    }
}

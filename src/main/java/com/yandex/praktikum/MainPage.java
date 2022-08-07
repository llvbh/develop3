package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    //URL главной страницы
    public static final String URL_MAIN_PAGE = "https://stellarburgers.nomoreparties.site/";

    //верхняя кнопка Личный Кабинет
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement btnOpenLoginPage;

    //кнопка Войти в аккаунт
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    public SelenideElement btnLoginAccount;

    // текущий элемент, который только у выбранного таба
    @FindBy(how = How.CSS,using = ".tab_tab_type_current__2BEPc")
    public SelenideElement currentActiveSection;

    //btn Оформить заказ
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement createOrder;

    // таб Булки
    @FindBy(how = How.CSS,using = ".tab_tab__1SPyG:nth-child(1)")
    private SelenideElement bunsTab;

    // вкладка Соусы
    @FindBy(how = How.CSS,using = ".tab_tab__1SPyG:nth-child(2)")
    private SelenideElement saucesTab;

    // вкладка Начинки
    @FindBy(how = How.CSS,using = ".tab_tab__1SPyG:nth-child(3)")
    private SelenideElement toppingsTab;

    public void clickBunsTab() {
        bunsTab.shouldBe(enabled).doubleClick();
    }

    public void clickSauceTab() {
        saucesTab.shouldBe(enabled).click();
    }

    public void clickToppingsTab() {
        toppingsTab.click();
    }

    public boolean isFillingsTabActive() {
        return currentActiveSection.getText().contentEquals("Начинки");
    }

    public boolean isSaucesTabActive() {
        return currentActiveSection.getText().contentEquals("Соусы");
    }

    public boolean isBunsTabActive() {
        return currentActiveSection.getText().contentEquals("Булки");
    }

    //нажать на кнопку Личный Кабинет
    public LoginPage clickBtnPersonalCabinet() {
        btnOpenLoginPage.scrollIntoView(true).click();
        System.out.println("personal");
        return page(LoginPage.class);
    }

    //нажать на кнопку Авторизованному юзеру Личный Кабинет
    public LoginAuthPage clickBtnAuthPersonalCabinet() {
        btnOpenLoginPage.scrollIntoView(true).click();
        System.out.println("personal");
        return page(LoginAuthPage.class);
    }

    //нажать на кнопку Войти в аккаунт
    public LoginPage clickBtnLoginAccount() {
        btnLoginAccount.click();
        return page(LoginPage.class);
    }

    //Проверка
    public boolean checkUserLogIn() {
        return createOrder.getText().contentEquals("Оформить заказ");
    }
}
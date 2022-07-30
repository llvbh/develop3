package com.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

//    //ингредиенты
//    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
//    public SelenideElement bun;
//
//    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
//    public SelenideElement sauce;
//
//    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
//    public SelenideElement filling;
//
//    //ингредиенты  внутри
//    @FindBy(how = How.XPATH, using = ".//h2[text()='Булки']")
//    public SelenideElement ingredientBun;
//
//    @FindBy(how = How.XPATH, using = ".//h2[text()='Соусы']")
//    public SelenideElement ingredientSauce;
//
//    @FindBy(how = How.XPATH, using = "//*[@id='root']/div/main/section[1]/div[2]/h2[2]")
//    public SelenideElement ingredient;

    //btn Оформить заказ
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement createOrder;

    //нажать на кнопку Личный Кабинет
    public LoginPage clickBtnPersonalCabinet() {
        btnOpenLoginPage.click();
        return page(LoginPage.class);
    }

    //нажать на кнопку Войти в аккаунт
    public LoginPage clickBtnLoginAccount() {
        btnLoginAccount.click();
        return page(LoginPage.class);
    }

    //Нажать  в личный кабинет
    public LoginPage clickPersonalCabinet() {
        btnOpenLoginPage.click();
        return page(LoginPage.class);
    }




}

package com.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public static final String URL_ACCOUNT_PAGE = "https://stellarburgers.nomoreparties.site/login";

    @FindBy(how = How.XPATH, using = ".//input[@name='Пароль']")
    private SelenideElement inputPass;

    @FindBy(how = How.XPATH, using = "(.//input[@name='name'])")
    private SelenideElement inputEmail;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement btnLogin;

    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    private SelenideElement logo;

    @FindBy(how = How.XPATH, using = "//p[@class='AppHeader_header__linkText__3q_va ml-2']")
    private SelenideElement constructor;

    //Ссылка на регистрацию
    @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
    private SelenideElement registrationLink;

    //Ссылка на Восстановить пароль
    @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
    private SelenideElement restorePassword;

    //Ссылка на Войти
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement logIn;

    //btn Оформить заказ
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement createOrder;

    @FindBy(how = How.XPATH, using = ".//h2[contains(text(),'Вход')]")
    private SelenideElement btnH2logIn;

    @FindBy(how = How.XPATH, using = ".//h1[contains(text(),'Соберите бургер')]")
    private SelenideElement textMakeBurger;

    public LoginPage setEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    public LoginPage setPass(String pass) {
        inputPass.sendKeys(pass);
        return this;
    }

    public MainPage clickLogInSave(){
        btnLogin.click();
        return page(MainPage.class);
    }

    public boolean clickConstructor(){
        constructor.click();
        return textMakeBurger.getText().contentEquals("Соберите бургер");
    }

    public boolean clickLogo(){
        logo.click();
        return textMakeBurger.getText().contentEquals("Соберите бургер");
    }

    public RegistrationPage clickRegistration(){
        registrationLink.scrollIntoView(true).click();
        return page(RegistrationPage.class);
    }

    public LoginPage clickLogInRegistration(){
        logIn.scrollIntoView(true).click();
        return this;
    }

    public LoginPage clickRestorePasswordRegistration(){
        restorePassword.scrollIntoView(true).click();
        return page(LoginPage.class);
    }

    public boolean checkText(){
        return btnH2logIn.getText().contentEquals("Вход");
    }
}
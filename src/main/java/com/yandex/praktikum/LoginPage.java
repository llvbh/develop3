package com.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;
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

    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement exit;

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

    public LoginPage setEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }
    public LoginPage setPass(String pass) {
        inputPass.sendKeys(pass);
        return this;
    }
    public LoginPage clickSave(){
        btnLogin.click();
        System.out.println("vdvdxvc");
        return this;
    }

    public MainPage clickConstructor(){
        constructor.click();
        return page(MainPage.class);
    }

    public MainPage clickLogo(){
        logo.click();
        return page(MainPage.class);
    }

    public MainPage clickExitBtn(){
        if (exit.exists()){
            exit.click();
        }
        return page(MainPage.class);
    }

    public RegistrationPage clickRegistration(){
        registrationLink.click();
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

    public LoginPage checkLoginText(){
        createOrder.shouldHave(Condition.exactText("Оформить заказ"));
        return  this;

    }

    public LoginPage checkText(){
        btnH2logIn.shouldHave(Condition.exactText("Вход"));
        return page(LoginPage.class);

    }



}
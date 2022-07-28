package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public static final String URL_PRIVATE_OFFICE_PAGE = "https://stellarburgers.nomoreparties.site/login";


    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    //*[@placeholder='Email
    private SelenideElement inputEmail;

    @FindBy(how = How.XPATH, using = "//input[@name='Пароль']")
    private SelenideElement inputPass;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement btnLogin;

    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    private SelenideElement logo;

    @FindBy(how = How.XPATH, using = "//p[@class='AppHeader_header__linkText__3q_va ml-2']")
    private SelenideElement constructor;

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

}

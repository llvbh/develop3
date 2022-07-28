package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public static final String URL_PRIVATE_OFFICE_PAGE = "https://stellarburgers.nomoreparties.site/login";


    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    //*[@placeholder='Email
    private SelenideElement inputEmail;

    @FindBy(how = How.XPATH, using = "//input[@name='Пароль']")
    private SelenideElement inputPass;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement btnLogin;


    public LoginPage setEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }
    public LoginPage setPass(String pass) {
        inputPass.sendKeys(pass);
        return this;
    }

    public LoginPage login(){
        btnLogin.click();
        System.out.println("vdvdxvc");
        return this;
    }
}

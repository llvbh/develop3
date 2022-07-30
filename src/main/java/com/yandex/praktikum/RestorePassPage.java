package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class RestorePassPage {
    //public static final String URL_REGISTRATION_PAGE = "https://stellarburgers.nomoreparties.site/forgot-password";

    //Ссылка на Войти
    @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
    private SelenideElement logIn;

    public LoginPage clickLogInRegistration(){
        logIn.scrollIntoView(true).click();
        return page(LoginPage.class);
    }


}

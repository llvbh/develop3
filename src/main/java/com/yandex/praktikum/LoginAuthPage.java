package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginAuthPage {

    public static final String URL_REGISTRATION_PAGE = "https://stellarburgers.nomoreparties.site/account/profile";


    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement exit;

    public LoginPage clickExitBtn(){
        System.out.println("exit");
        exit.click();
        return page(LoginPage.class);
    }
}

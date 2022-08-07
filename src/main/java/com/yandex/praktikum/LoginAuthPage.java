package com.yandex.praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginAuthPage {

    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement exit;

    public LoginPage clickExitBtn(){
        exit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
        return page(LoginPage.class);
    }
}

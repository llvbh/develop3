package com.yandex.praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage {
    //Ссылка на Войти
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement logIn;

    @FindBy(how = How.XPATH, using = "(.//input[@name='name'])[1]")
    private SelenideElement inputName;

    @FindBy(how = How.XPATH, using = ".//input[@name='Пароль']")
    private SelenideElement inputPass;

    @FindBy(how = How.XPATH, using = "(.//input[@name='name'])[2]")
    private SelenideElement inputEmail;

    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement btnRegistration;

    @FindBy(how = How.XPATH, using = ".//p[@class='input__error text_type_main-default']")
    private SelenideElement errorMsg;

    public LoginPage clickLogInRegistration(){
        logIn.scrollIntoView(true).click();
        return page(LoginPage.class);
    }

    public RegistrationPage setName(String name) {
        inputName.sendKeys(name);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        inputEmail.sendKeys(email);
        return this;
    }

    public RegistrationPage setPass(String pass) {
        inputPass.sendKeys(pass);
        return this;
    }

    public LoginPage clickSave(){
        btnRegistration.click();
        return page(LoginPage.class);
    }

    public LoginPage checkRegistrationFail(){
        btnRegistration.click();
        errorMsg.shouldHave(Condition.exactText("Некорректный пароль"));
        return page(LoginPage.class);

    }
}
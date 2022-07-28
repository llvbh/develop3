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

    //нажать на кнопку Личный Кабинет
    public LoginPage clickBtnPersonalCabinet() {
        btnOpenLoginPage.click();
        return page(LoginPage.class);
    }

//    //кнопка куки
//    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
//    private SelenideElement btnGetCookie;
//
//    //средняя кнопка Заказать
//    @FindBy(how = How.XPATH, using = ".//div[5]/button[text()='Заказать']")
//    public SelenideElement btnMiddleShowOrderForm;
//
//    //logo яндекс
//    @FindBy(how = How.CLASS_NAME, using="Header_LogoYandex__3TSOI")
//    private SelenideElement logoYandex;
//
//    //лого сайта самокат
//    @FindBy(how = How.CLASS_NAME, using="Header_LogoScooter__3lsAR")
//    private SelenideElement logoScooter;
//
//    //logo учебный тренажер
//    @FindBy(how = How.CLASS_NAME, using="Header_Disclaimer__3VEni")
//    private SelenideElement trainingSimulator;
//
//    //кнопка Статус заказа
//    @FindBy(how = How.CLASS_NAME, using="Header_Link__1TAG7")
//    private SelenideElement btnStateOrder;
//
//    //поле ввода заказа
//    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
//    private SelenideElement textBoxOrderNum;
//
//    //кнопка найти заказ/GO
//    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Go!')]")
//    private SelenideElement btnFindOrder;
//
//    //header Самокат на пару дней
//    @FindBy(how = How.CLASS_NAME, using="Home_Header__iJKdX")
//    private SelenideElement header;
//
//    // subHeader привезем за пару дней+Он лёгкий и с мощными колёсами
//    @FindBy(how = How.CLASS_NAME, using="Home_SubHeader__zwi_E")
//    private ElementsCollection subHeader;
//
//    //картинка самокат
//    @FindBy(how = How.CLASS_NAME, using ="div.Home_Scooter__3YdJy")
//    private SelenideElement imgScooter;
//
//    //стрелка вниз
//    @FindBy(how = How.CLASS_NAME, using ="div.Home_ArrowDown__fnDme.Home_Animated__17o7s.Home_Bounce__O19_v")
//    private SelenideElement imgArrowDown;
//
//    //информация про модель
//    @FindBy(how = How.CLASS_NAME, using="Home_Column__xlKDK")
//    private ElementsCollection infoAboutScooter;
//
//    //текст модель
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Модель Toxic PRO')]")
//    private SelenideElement textInfoModel;
//
//    //текст максимальная скорость
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Максимальная скорость')]")
//    private SelenideElement textMaxSpeed;
//
//    //цифры скорость
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'40 км/ч')]")
//    private SelenideElement textSpeed;
//
//    // проедет без подзарядки
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Проедет без поздарядки')]")
//    private SelenideElement textRideWithoutEnergy;
//
//    // 80 км
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'80 км')]")
//    private SelenideElement textDistance;
//
//    //выдерживает вес
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Выдерживает вес')]")
//    private SelenideElement textBearTheWeight;

//    //вес
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'120 кг')]")
//    private SelenideElement textWeight;
//
//    //разделители в инфе про модель
//    @FindBy(how = How.CLASS_NAME, using="Home_Separator__3cWAk")
//    private ElementsCollection separator;
//
//    //"как это работает"
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Как это работает')]")
//    private SelenideElement headerHowItIsWork;
//
//    //заказывайте самокат
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Заказываете самокат')]")
//    private SelenideElement textOrderScooter;
//
//    //Выбираете, когда и куда привезти
//    @FindBy(how = How.CSS, using="div.Home_StatusDescription__3WGl5")
//    private ElementsCollection textWhenAndWhereDelivery;
//
//    //цифры в кругах
//    @FindBy(how = How.CSS, using="div.Home_StatusCircle__3_aTp")
//    private ElementsCollection circleNumber;
//
//    //курьер привозит самокат
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Курьер привозит самокат')]")
//    private SelenideElement textCourierDeliveryScooter;
//
//    // вы оплачиваете аренду
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'А вы — оплачиваете аренду')]Э")
//    private SelenideElement textYouPayRent;
//
//    //текст катаетесь
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Катаетесь')]")
//    private SelenideElement textSkate;
//
//    //сколько часов осталось
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Сколько часов аренды осталось — видно на сайте')]")
//    private SelenideElement textTimeToCancelRent;
//
//    //текст курьер заберет самокат
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Курьер забирает самокат')]")
//    private SelenideElement textCourierPickUpScooter;
//
//    //текст когда закончится аренда
//    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Когда аренда заканчивается')]")
//    private SelenideElement textRentIsOver;
//
//    //блок вопросов
//    @FindBy(how=How.CLASS_NAME, using = "accordion")
//    private SelenideElement subheaderQuestions;
//    //вопросы
//    @FindBy(how=How.CLASS_NAME, using = "accordion__button")
//    private ElementsCollection listOfQuestions;
//    //ответ
//    @FindBy(how=How.CLASS_NAME, using = "accordion__panel")
//    private ElementsCollection answer;
//

//
//    //scroll до вопросов
//    public MainPage scrollIntoQuestions(){
//        subheaderQuestions.scrollIntoView(true);
//        return this;
//    }
//    //получаем вопросы
//    public ElementsCollection getQuestions(){
//        return listOfQuestions;
//    }
//    //кликаем на вопрос
//    public MainPage clickQuestion(int i){
//        listOfQuestions.get(i).click();
//        return this;
//    }
//    // получаем ответы
//    public ElementsCollection getAnswer() {
//        return answer;
//    }
//    //нажать на верхнюю кнопку Заказать
//    public OrderPage clickBtnShowOrderForm(){
//        btnShowOrderForm.scrollTo().click();
//        return page(OrderPage.class);
//    }
//    //нажать на среднюю кнопку Заказать
//    public OrderPage clickBtnMiddleShowOrderForm(){
//        btnMiddleShowOrderForm.scrollTo().click();
//        return page(OrderPage.class);
//    }

}


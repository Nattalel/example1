package SelenoidTest;

import org.testng.annotations.Test;
import pageObject.*;

public class emailLogic extends Basic{
    String topic;
    @Test
    public void etest() {

        String theme = "Автотестик";
        String message = "Привет, мир";
        String signature = "Наталья";
        String themeNow = "Домашка";
        String messageNow = "Здравствуйте";

        //Открытие почты Яндекс
        getDriver().get("https://mail.yandex.ru/");
        getDriver().manage().window().maximize();
        EmailUnit in = new EmailUnit(getDriver());
        in.clickSubmitSearch();

        //1. Ввод логина
        Login lg = new Login(getDriver());
        lg.setSearchText("autotestlearn");
        lg.clickSubmitSearch();

        //1. Ввод пароля
        Password ps = new Password(getDriver());
        ps.setSearchText("S128500");
        //2. Вход в почту
        ps.clickSubmitSearch();

        //3. Клик на кнопку написать письмо
        Mail ml = new Mail(getDriver());
        ml.clickSubmitSearch();
        //4. Проверка, что открылась форма отправки сообщений
        ml.assertImagesTabIsOpen();


       //5. Отправка сообщения
        Message msg = new Message(getDriver());
        msg.setSearchText("autotestlearn@yandex.ru");
        msg.setSearchText1(theme);
        msg.setSearchText2(message);
        msg.clickSubmitSearch();

        //6. Входящие
        msg.clickSubmitSearch2();
        msg.clickSubmitSearch3();
//
//        //6. Проверяем тему
        String text = "" ;
        text = msg.getScreenShot( );

        String eq = new String(text);
        //Сравниваем значения
        if(eq.equals(theme)) {
            System.out.println("Тема сообщения присутствует в списке входящих ");
        }


        //7. Открываем письмо`
        msg.clickSubmitSearch4();
        msg.clickSubmitSearch5();

        //7. Проверяем тему сообщения
        String text2 = "";
        text2 = msg.getThemeMessage();
        String th = new String(text2);
        if(th.equals(theme)) {
            System.out.println("Темы совпадают");
        }

        //7. Проверяем текст сообщения
        String text3 = "";
        text3 = msg.getTextMessage();
        String tm = new String(text3);
        if(tm.equals(message)) {
            System.out.println("Текст сообщений совпадает");
        }


        //8. Изменяем подпись
        Signature sgn = new Signature(getDriver());
        // Переход в настройки учетной записи
        sgn.clickSubmitSearch();
        sgn.clickSubmitSearch1();
        // Очистка поля подписи
        sgn.clearField();
        // Изменение подписи
        sgn.setSearchText(signature);
        sgn.clickSaveSignature();
        sgn.clickYandexMail();


        //9. Клик на кнопку написать письмо
        //Mail ml = new Mail(getDriver());
        ml.clickSubmitSearch();
        // Проверка, что открылась форма отправки сообщений
        ml.assertImagesTabIsOpen();


        //10. Отправка сообщения
        //Message msg = new Message(getDriver());
        msg.setSearchText("autotestlearn@yandex.ru");
        msg.setSearchText1(themeNow);
        msg.setSearchText2(messageNow);
        msg.clickSubmitSearch();


        //11. Входящие
        msg.clickSubmitSearch2();
        msg.clickSubmitSearch3();

        // Проверяем тему
        String text11 = "" ;
        text11 = msg.getScreenShot( );

        String eq1 = new String(text11);
        //Сравниваем значения
        if(eq1.equals(themeNow)) {
            System.out.println("Тема сообщения присутствует в списке входящих ");
        }

        //12.  Открываем письмо
        msg.clickSubmitSearch4();
        msg.clickSubmitSearch5();

        String text22 = "";
        text22 = msg.getThemeMessage();
        String th2 = new String(text22);
        if(th2.equals(themeNow)) {
            System.out.println("Темы совпадают");
        }

        //7. Проверяем текст сообщения
        String text33 = "";
        text33 = msg.getTextMessage();
        String tm3 = new String(text33);
        if(tm3.equals(messageNow)) {
            System.out.println("Текст сообщений совпадает");
        }

//         Проверяем подпись
        String text4 = "";
        text4 = ml.getSignature();
        ml.getSignature();
        String sg = new String(text4);
        if(sg.equals(signature)) {
            System.out.println("Подписи совпадают");
        }
//
//        13. Возвращаемся во входящие
        msg.clickSubmitSearch2();
        msg.clickSubmitSearch3();
        msg.clickListMessage1();
        msg.clickListMessage2();


//        14. Удаляем письма
//        Отмечаем чекбоксы
        DeleteMessage dm = new DeleteMessage(getDriver());
        dm.clickSubmitSearch1();
        dm.clickSubmitSearch2();
        //Удаляем
        dm.clickDelMessage();

        //Проверка отсутствия сообщений

        dm.clickClearMessage();

    }

}

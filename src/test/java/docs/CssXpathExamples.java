package docs;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CssXpathExamples {

    void cssXpathExamples() {
        open("url");

        //<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email"
        //эталон
        $(by("data-testid", "royal_email")).setValue("some@email.com");

        //другие возможности сделать тоже самое
        $("#email").setValue("some@email.com"); //самый правильный способ
        $(byId("email")).setValue("some@email.com");
        $("[id='email']").setValue("some@email.com");
        $("input[id='email]").setValue("some@email.com");
        $("input#email").setValue("some@email.com");
        $(by("id","email")).setValue("some@email.com");
        $x("//input[@id='email]").setValue("some@email.com");
        $x("//*[@id='email]").setValue("some@email.com");

        $(byName("email")).setValue("some@email.com");
        $("[name='email]").setValue("some@email.com");
        $("input[name='email']").setValue("some@email.com");

        //тоже самое с xPath
        $x("//input[@name='email']").setValue("some@email.com");
        $x("//*[@name='email']").setValue("some@email.com");

        $(byClassName("login_form_input_box")).setValue("some@email.com");
        $(".login_form_input_box").setValue("some@email.com");
        $(".inputtext.login_form_input_box").setValue("some@email.com");
        $("input.inputtext.login_form_input_box").setValue("some@email.com");
        $("input.inputtext.login_form_input_box#email").setValue("some@email.com");
        $x("//*[@class='login_form_input_box']").setValue("some@email.com");
    }
}

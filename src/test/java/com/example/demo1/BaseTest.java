package com.example.demo1;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseTest extends BasePage{

    @Test
    public void login() {
        System.out.println(title());
        //driver.switchTo().alert().accept();
        elementsInfo.seeLoginButton.shouldBe(visible);
        //logger.info(elementsInfo.seeLoginButton + " elementi görüldü.");
        elementsInfo.seeLoginButton.click();
        //logger.info(elementsInfo.seeLoginButton + " elementine tiklandi");
        elementsInfo.findEmailTextbox.sendKeys("rcnkirbiyik@gmail.com");
        //logger.info(elementsInfo.findEmailTextbox +" alanına text yazıldı");
        elementsInfo.findPasswordTextbox.sendKeys("Ercan30.");
        //logger.info(elementsInfo.findPasswordTextbox + " alanına text yazıldı");
        elementsInfo.loginButton.click();
        //logger.info(elementsInfo.loginButton + " elementine tıklandı.");
        elementsInfo.myAccountButton.shouldBe(visible);
        elementsInfo.myAccountButton.click();
        assertEquals("LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki", Selenide.title());
    }
    @Test
    public void search() {
        System.out.println(title());
        elementsInfo.searchTextbox.sendKeys("Deri Mont");
        elementsInfo.searchTextbox.pressEnter();
        elementsInfo.searchTextbox.shouldHave(attribute("value", "Deri Mont"));
    }

    @Test
    public void toolsMenu() {
        elementsInfo.seeLoginButton.click();

        $("a[class='login-form__link']").shouldBe(visible);
    }

}

package com.example.demo1;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseTest extends BasePage{

    @Test
    public void login() {
        System.out.println(title());
        elementsInfo.seeLoginButton.click();
        elementsInfo.findEmailTextbox.sendKeys("rcnkirbiyik@gmail.com");
        elementsInfo.findPasswordTextbox.sendKeys("Ercan30.");
        elementsInfo.loginButton.click();
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
        elementsInfo.loginButton.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }

}

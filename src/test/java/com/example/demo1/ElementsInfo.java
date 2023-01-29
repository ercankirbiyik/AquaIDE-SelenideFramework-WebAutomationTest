package com.example.demo1;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://www.lcwaikiki.com/tr-TR/TR
public class ElementsInfo {
    public SelenideElement seeLoginButton = $("svg[id^='user']");
    public SelenideElement findEmailTextbox = $("input[name='email']");
    public SelenideElement findPasswordTextbox = $("input[name='password']");
    public SelenideElement loginButton = $("button[class^='login-form']");
    public SelenideElement searchTextbox = $("input[class$='input']");
    public SelenideElement searchButton= $("button[class*='search-box']");
    public SelenideElement myAccountButton = $("#user_1_");
}

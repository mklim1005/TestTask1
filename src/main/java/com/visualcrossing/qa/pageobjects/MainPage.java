package com.visualcrossing.qa.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public static final String mainPageUrl = "https://www.visualcrossing.com";

    @FindBy(how = How.XPATH, using = ".//button[text()='Accept all cookies']")
    private SelenideElement cookie;

    @FindBy(how = How.XPATH, using = ".//li[@class='nav-item']/a[text()='Weather Data']")
    private SelenideElement weatherDataUpperLink;

    public void acceptCookies() {
        cookie.click();
    }

    public TotalWeatherDataPage clickWeatherDataUpperLink() {
        weatherDataUpperLink.click();

        return page(TotalWeatherDataPage.class);
    }


}

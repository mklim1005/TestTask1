package com.visualcrossing.qa.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class WeatherDashBoardPage {

    private String headerWeatherHistory = ".//h1[contains(text(),'Weather History Dashboard for %s')]";

    @FindBy(how = How.XPATH, using = ".//div[@class='chartcontainer temp']")
    private SelenideElement chartTemperature;

    @FindBy(how = How.XPATH, using = ".//div[@class='chartcontainer wind']")
    private SelenideElement chartWind;

    public boolean headerIsDisplayed(String cityName) {
        String headerXpath = String.format(headerWeatherHistory, cityName);
        return $(By.xpath(headerXpath)).isDisplayed();
    }

    public boolean chartTemperatureIsDisplayed() {
        return chartTemperature.isDisplayed();
    }

    public boolean chartWindIsDisplayed() {
        return chartWind.isDisplayed();
    }
}

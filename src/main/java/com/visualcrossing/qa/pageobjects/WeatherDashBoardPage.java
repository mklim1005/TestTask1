package com.visualcrossing.qa.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeatherDashBoardPage {

    @FindBy(how = How.XPATH, using = ".//h1[contains(text(),'Weather History Dashboard for ')]")
    private SelenideElement headerWeatherHistory;

    @FindBy(how = How.XPATH, using = ".//div[@class='chartcontainer temp']")
    private SelenideElement chartTemperature;

    @FindBy(how = How.XPATH, using = ".//div[@class='chartcontainer wind']")
    private SelenideElement chartWind;

    public boolean headerIsDisplayed() {
        return headerWeatherHistory.isDisplayed();
    }

    public boolean chartTemperatureIsDisplayed() {
        return chartTemperature.isDisplayed();
    }

    public boolean chartWindIsDisplayed() {
        return chartWind.isDisplayed();
    }
}

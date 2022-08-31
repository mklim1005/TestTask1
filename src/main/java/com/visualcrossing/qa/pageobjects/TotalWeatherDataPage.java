package com.visualcrossing.qa.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class TotalWeatherDataPage {

    @FindBy(how = How.XPATH, using = ".//input[@class='form-control' and @placeholder='Enter a location']")
    private SelenideElement inputCityField;

    @FindBy(how = How.XPATH, using = ".//button[text()='Search']")
    private SelenideElement searchButton;

    public TotalWeatherDataPage insertCity(String cityName) {
        inputCityField.sendKeys(cityName);

        return this;
    }

    public WeatherDashBoardPage clickSearchButton() {
        searchButton.click();

        return page(WeatherDashBoardPage.class);
    }
}

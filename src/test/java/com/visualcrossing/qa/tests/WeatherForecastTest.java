package com.visualcrossing.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.visualcrossing.qa.pageobjects.MainPage;
import com.visualcrossing.qa.pageobjects.WeatherDashBoardPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class WeatherForecastTest {

    MainPage mainPage;

    @Before
    public void maxWindowSizeAndAcceptCookies() {
        Configuration.startMaximized = true;

        mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.acceptCookies();
    }

    @After
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

    @Test
    public void chooseTallinnAndVerifyWeatherIsShown() {
        String cityName = "Tallinn";

        WeatherDashBoardPage weatherDashBoardPage = mainPage
                .clickWeatherDataUpperLink()
                .insertCity(cityName)
                .clickSearchButton();

        Assert.assertTrue(weatherDashBoardPage.headerIsDisplayed());
        Assert.assertTrue(weatherDashBoardPage.chartTemperatureIsDisplayed());
        Assert.assertTrue(weatherDashBoardPage.chartWindIsDisplayed());
    }
}

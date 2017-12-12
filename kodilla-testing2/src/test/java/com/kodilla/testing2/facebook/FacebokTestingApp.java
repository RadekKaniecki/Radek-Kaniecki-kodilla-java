package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebokTestingApp {
    public static final String XPATH_SELETC_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELETC_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELETC_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELETC_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("14");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELETC_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(2);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELETC_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1990");
    }

}

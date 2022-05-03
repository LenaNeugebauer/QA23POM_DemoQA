package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends PageBase {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".range-slider")
    WebElement slider;

    @FindBy(id = "sliderValue")
    WebElement sliderValue;

    public SliderPage moveElementInHorizontalDirection() {

        Actions actions = new Actions(driver);

        actions.moveToElement(slider, 50, 0).perform();
        slider.click();
        System.out.println("Moved slider in horizontal direction");

        should(sliderValue, 10);
        Assert.assertTrue(sliderValue.isDisplayed());
        return this;
    }
}

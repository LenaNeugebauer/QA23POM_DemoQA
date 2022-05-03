package com.telran.demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoCompletePage extends PageBase {

    public AutoCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "autoCompleteMultipleInput")
    WebElement colorsInput;

    @FindBy(id = "react-select-2-options-0")
    WebElement selectInput;

    public AutoCompletePage addTypeMultipleColorNames(String[] colors) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != null) {
                type(colorsInput, colors[i]);
                colorsInput.sendKeys(Keys.ENTER);
            }
        }
        return this;
    }


    @FindBy(id = "autoCompleteSingleInput")
    WebElement colorInput;

    public AutoCompletePage addSingleColorName(String[] color) {
        colorInput.sendKeys("y");
        colorInput.sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }
}

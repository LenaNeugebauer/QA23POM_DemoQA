package com.telran.demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends PageBase{

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    public TextBoxPage keyBoardEvents() {

        Actions actions = new Actions(driver);
        type(userName,"Name");
        type(userEmail,"name@gmail.com");

        type(currentAddress,"Friedrichstrasse 176-179, 10117 Berlin");

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        actions.sendKeys(Keys.TAB).build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        String cAddress = currentAddress.getAttribute("value");
        //    System.out.println("Value of attribute: " + cAddress);

        String pAddress = permanentAddress.getAttribute("value");
        //  System.out.println("Value of address: " + pAddress);

        Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        return this;
    }
}

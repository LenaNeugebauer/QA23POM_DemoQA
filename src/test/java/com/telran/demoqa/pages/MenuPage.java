package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends PageBase{

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Main Item 2']")
    WebElement mainItem2;

    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
    WebElement subSubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 2']")
    WebElement suSubItem2;

    public MenuPage selectSubMenuItem() {

        Actions actions = new Actions(driver);

        actions.moveToElement(mainItem2).perform();
        System.out.println("Done Mouse hover on 'Main Item 2'");

        actions.moveToElement(subSubList).perform();
        System.out.println("Done Mouse hover on 'SUB SUB LIST'");

        click(suSubItem2);
        System.out.println("Selected 'Sub Sub Item 2'");
        return this;
    }
}
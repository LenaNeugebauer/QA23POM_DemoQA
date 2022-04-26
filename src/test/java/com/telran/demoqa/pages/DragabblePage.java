package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragabblePage extends PageBase {

    public DragabblePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dragBox")
    WebElement dragMeDrag;

    @FindBy(id = "app")
    WebElement dropHereDrag;

    public DragabblePage dragMeDragabblePage() {
        Actions actions = new Actions(driver);
        pause(3000);
        actions.dragAndDropBy(dragMeDrag,460,33).perform();

        String textDropHere = dropHereDrag.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }

}
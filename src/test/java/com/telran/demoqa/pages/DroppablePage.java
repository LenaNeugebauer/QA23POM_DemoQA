package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends PageBase {

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DroppablePage dragMeWithActions() {

        Actions actions = new Actions(driver);

        actions.dragAndDrop(dragMe,dropHere).perform();
        String textDropHere = dropHere.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }

    public DroppablePage dragMeBy() {

        Actions actions = new Actions(driver);

        int xOffset1 = dragMe.getLocation().getX();
        int yOffset1 = dragMe.getLocation().getY();
        System.out.println("xOffset1 --> " + xOffset1 + " " + "yOffset1 --> " + yOffset1);

        int xOffset = dropHere.getLocation().getX();
        int yOffset = dropHere.getLocation().getY();
        System.out.println("xOffset --> " + xOffset + " " + "yOffset --> " + yOffset);

        xOffset = (xOffset - xOffset1) + 50;
        yOffset = (yOffset - yOffset1) + 100;
        pause(1000);

        actions.dragAndDropBy(dragMe,xOffset,yOffset).perform();

        String textDropHere = dropHere.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }

    public DroppablePage dragMeByPosition() {

        Actions actions = new Actions(driver);
        pause(3000);
        actions.dragAndDropBy(dragMe,250,50).perform();

        String textDropHere = dropHere.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }

    @FindBy(id = "droppableExample-tab-accept")
    WebElement accept;

    public DroppablePage accept() {
        click(accept);
        return this;
    }

    @FindBy(id = "acceptable")
    WebElement dragMeAccept;

    @FindBy(id = "droppable")
    WebElement dropHereAccept;

    @FindBy(id = "notAcceptable")
    WebElement dragMeNotAccept;

    public DroppablePage dragAcceptableFrames() {
        Actions actions = new Actions(driver);
        pause(3000);
        actions.dragAndDropBy(dragMeAccept,450,30).perform();

        String textDropHere = dropHereAccept.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }

    public DroppablePage dragNotAcceptableFrames() {
        Actions actions = new Actions(driver);
        pause(3000);
        actions.dragAndDropBy(dragMeNotAccept,450,33).perform();

        String textDropHere = dropHereAccept.getText();

        if (textDropHere.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't dropped to target as expected");
        }
        return this;
    }
}
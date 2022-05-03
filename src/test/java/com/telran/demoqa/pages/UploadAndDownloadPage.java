package com.telran.demoqa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;

public class UploadAndDownloadPage extends PageBase{

    public UploadAndDownloadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uploadFile")
    WebElement uploadFile;

    @FindBy(id = "uploadedFilePath")
    WebElement uploadedFilePath;

    public UploadAndDownloadPage performKeyEventsUsingRobot() {

        clickWithRectangle(uploadFile,12);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_SHIFT);
        pause(1000);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_ENTER);
        return this;
    }

    public String getPath() {
        return uploadedFilePath.getText();
    }

    public UploadAndDownloadPage performMouseEventsUsingRobot() {

        clickWithRectangle(uploadFile,12);
        pause(2000);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        Dimension dimension = driver.manage().window().getSize();
        System.out.println("Dimension x and y: " + dimension.getWidth() + " " + dimension.getHeight());

        int x = (dimension.getWidth()/4) + 400;
        int y = (dimension.getWidth()/10) + 170;

        robot.mouseMove(x,y);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("Browse button clicked");
        pause(10000);

        robot.keyPress(KeyEvent.VK_ENTER);
        System.out.println("Closed the windows popup");
        pause(2000);

        return this;
    }
}
package com.telran.demoqa.tests;

import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.SidePanel;
import com.telran.demoqa.pages.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).getElementsPage();
        new SidePanel(driver).selectTextBox();
    }

    @Test
    public void keyBoardEventsTest() {
        new TextBoxPage(driver).keyBoardEvents();
    }
}
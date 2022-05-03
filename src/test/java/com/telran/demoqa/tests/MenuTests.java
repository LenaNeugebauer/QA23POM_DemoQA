package com.telran.demoqa.tests;

import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.MenuPage;
import com.telran.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).getWidgetsPage();
        new SidePanel(driver).selectMenuPage();
    }

    @Test
    public void selectSubMenuItemTest() {
        new MenuPage(driver).selectSubMenuItem();
    }
}
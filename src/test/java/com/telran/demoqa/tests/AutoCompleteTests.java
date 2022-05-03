package com.telran.demoqa.tests;

import com.telran.demoqa.data.ColorData;
import com.telran.demoqa.pages.AutoCompletePage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoCompleteTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).getWidgetsPage();
        new SidePanel(driver).selectAutoComplete();
    }

    @Test
    public void fillAutoComplete() {
        new AutoCompletePage(driver)
                .addTypeMultipleColorNames(ColorData.COLORS)
                .addSingleColorName(ColorData.COLOR);
    }
}

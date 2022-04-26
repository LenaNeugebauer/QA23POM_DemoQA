package com.telran.demoqa.tests;

import com.telran.demoqa.pages.DragabblePage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropDragabbleTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions(){
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDragabble();
    }

    @Test
    public void dragMeDragabblePageTest() {

        new DragabblePage(driver).dragMeDragabblePage();
    }

}

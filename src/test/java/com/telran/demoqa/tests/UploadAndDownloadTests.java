package com.telran.demoqa.tests;

import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.SidePanel;
import com.telran.demoqa.pages.UploadAndDownloadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadAndDownloadTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).getElementsPage();
        new SidePanel(driver).selectUploadAndDownload();
    }

    @Test
    public void robotKeyEventsTest() {
        new UploadAndDownloadPage(driver).performKeyEventsUsingRobot().getPath().contains("D1.txt");
    }

    @Test
    public void robotMouseEventsTest() {
        new UploadAndDownloadPage(driver).performMouseEventsUsingRobot().getPath().contains("D1.txt");
    }


}


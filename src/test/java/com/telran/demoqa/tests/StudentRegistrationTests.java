package com.telran.demoqa.tests;

import com.telran.demoqa.data.StudentData;
import com.telran.demoqa.helpers.DataProviders;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.PracticeFormPage;
import com.telran.demoqa.pages.SidePanel;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentRegistrationTests extends TestBase {



    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void fillStudentFormPositiveTest() {
        new PracticeFormPage(driver)
                .hideIframes()
                .enterPersonalData(StudentData.FIRST_NAME, StudentData.LAST_NAME, StudentData.EMAIL, StudentData.PHONE_NUMBER)
                .selectGender(StudentData.GENDER)
                .typeOfDate(StudentData.DATE)
                //      .chooseDate("April","2021","13");
                .addSubject(StudentData.SUBJECTS)
                .chooseHobby(StudentData.HOBBIES)
                .uploadFile(StudentData.PHOTO_URL)
                .enterAddress(StudentData.ADDRESS)
                .inputState(StudentData.STATE)
                .inputCity(StudentData.CITY)
                .submit();
        Assert.assertTrue(new PracticeFormPage(driver).getTitleFromDialogWindow().contains("Thanks for submitting the form"));
        new PracticeFormPage(driver).closeDialogWindow();
    }


    @Test(dataProvider = "newDemoFromCSV", dataProviderClass = DataProviders.class)
    public void fillStudentFormPositiveTestWithDataProviders() {
        new PracticeFormPage(driver)
                .hideIframes()
                .enterPersonalData(StudentData.FIRST_NAME, StudentData.LAST_NAME, StudentData.EMAIL, StudentData.PHONE_NUMBER)
                .selectGender(StudentData.GENDER)
                .typeOfDate(StudentData.DATE)
                .addSubject(StudentData.SUBJECTS)
                .chooseHobby(StudentData.HOBBIES)
                .uploadFile(StudentData.PHOTO_URL)
                .enterAddress(StudentData.ADDRESS)
                .inputState(StudentData.STATE)
                .inputCity(StudentData.CITY)
                .submit();
        Assert.assertTrue(new PracticeFormPage(driver).getTitleFromDialogWindow().contains("Thanks for submitting the form"));
        new PracticeFormPage(driver).closeDialogWindow();
    }
}
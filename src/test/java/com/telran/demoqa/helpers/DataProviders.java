package com.telran.demoqa.helpers;

import com.telran.demoqa.pages.PracticeFormPage;
import com.telran.demoqa.tests.TestBase;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders extends TestBase {

    @DataProvider
    public Iterator<Object[]> newDemoFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/Student.csv")));

        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(",");

            list.add(new Object[]{new PracticeFormPage(driver)
                    .enterPersonalData(split[0], split[1], split[2], split[3])
                    .selectGender(split[4])
                    .typeOfDate(split[5])
                    .addSubject(new String[]{split[6]})
                    .chooseHobby(new String[]{split[7]})
                    .uploadFile(split[8])
                    .enterAddress(split[9])
                    .inputState(split[10])
                    .inputCity(split[11])});
            line = reader.readLine();
        }
        return list.iterator();
    }
}

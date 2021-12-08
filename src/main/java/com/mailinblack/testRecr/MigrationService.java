package com.mailinblack.testRecr;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MigrationService {


    public List<Stat> migrateFromFile(){
        return new ArrayList<>();
    }


    public List<String[]> readFile(){
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/list.csv"))) {
            return reader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return null;
    }
}

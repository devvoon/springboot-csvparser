package com.example.csvparser.util;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {

    public List<String[]> read(final String filePath) throws IOException {
        List<String[]> results = new ArrayList<>();

        CSVReader csvReader = new CSVReader(new FileReader(filePath));
        String[] nextLine = null;

        while(true){
            try{
                if ((nextLine = csvReader.readNext()) != null){
                    results.add(nextLine);
                }else {
                    break;
                }
            }catch (CsvValidationException e){
                e.printStackTrace();
            }
        }
        return  results;
    }
}

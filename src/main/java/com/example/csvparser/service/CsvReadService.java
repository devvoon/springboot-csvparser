package com.example.csvparser.service;

import com.example.csvparser.util.CsvFileParser;
import com.example.csvparser.util.CsvFileReader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CsvReadService {

    public String readCsv() throws IOException {
        String filePath = "src/main/resources/data/data.csv";
        String[] arrPath = filePath.split("/");
        String fileName = arrPath[arrPath.length-1];

        CsvFileReader csvFileReader = new CsvFileReader();
        List<String[]> csvFileRows = csvFileReader.read(filePath);

        CsvFileParser csvFileParser = new CsvFileParser();
        String[] header = csvFileParser.parseHeader(csvFileRows);
        csvFileParser.parseBody(csvFileRows);

        return fileName;
    }

}

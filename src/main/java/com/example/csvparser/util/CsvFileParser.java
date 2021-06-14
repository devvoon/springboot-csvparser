package com.example.csvparser.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvFileParser {

    public String[] parseHeader(List<String[]> csvFileRows){
        final int HEADER_INDEX = 0;
        String[] row = csvFileRows.get(HEADER_INDEX);
        String[] columns ;

        String[] headerRow = csvFileRows.get(HEADER_INDEX);
        return headerRow;
    }

    public List<List<String>> parseBody(List<String[]> csvFileRows){
        final int BODY_INDEX = 1;
        List<List<String>> bodyRows = new ArrayList<>(new ArrayList<>());
        for (String[] row : csvFileRows.subList(BODY_INDEX, csvFileRows.size())) {
            bodyRows.add(new ArrayList<>(Arrays.asList(row)));
        }
        return bodyRows;
    }
}

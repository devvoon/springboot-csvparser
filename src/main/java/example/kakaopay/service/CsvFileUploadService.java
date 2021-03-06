package example.kakaopay.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import example.kakaopay.domain.InstitutionCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class CsvFileUploadService {

    /**
     *  csv 파일 upload
     */
    @Transactional
    public String upload() {
        String filePath = "src/main/resources/data.csv";
        String[] arrPath = filePath.split("/");
        String fileName = arrPath[arrPath.length-1];

        List<String[]> csvFileRows = getCsvFileData(filePath);

        String[] header = csvParseHeader(csvFileRows);
        List<List<String>> body = csvParseBody(csvFileRows);

        saveInstitution(header);
        return fileName;
    }

    private void saveInstitution(String[] header) {

        for (String str : header) {
            String institutionName  = instituInstitutionCode.valueOf(str);
            String institutionCode  = instituInstitutionCode.valueOf(str);
        }
    }

    private List<String[]> getCsvFileData(String filePath) {
        List<String[]> results = null;
        try {
            results = readCsvFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }

    private List<String[]> readCsvFile(String filePath) throws IOException {
        List<String[]> results = new ArrayList<>();

        //filepath로 csv파일을 읽어 옴
        CSVReader csvReader = new CSVReader(new FileReader(filePath));

        String[] nextLine = null;
        while(true){
            try {
                if (!(null != (nextLine = csvReader.readNext()))) break;
            } catch (CsvValidationException e) {
                e.printStackTrace();
            }
            results.add(nextLine);
        }

        return results;
    }

    private String[] csvParseHeader(List<String[]> csvFileRows){

        int HEADER_INDEX = 0;
        String[] row = csvFileRows.get(HEADER_INDEX);
        String[] columns;

        //Pattern pattern = Pattern.compile("^[가-힣]*$");
        //Matcher matcher;
        for (String column: row) {
            column.replace(column, )
            //matcher = pattern.matcher(column);
        }




        String[] headerRow = csvFileRows.get(HEADER_INDEX);
        return headerRow;
    }

    private List<List<String>> csvParseBody(List<String[]> csvFileRows){
        int BODY_INDEX = 1;
        List<List<String>> bodyRows = new ArrayList<>(new ArrayList<>());
        for (String[] row : csvFileRows.subList(BODY_INDEX, csvFileRows.size())) {
            bodyRows.add(new ArrayList<>(Arrays.asList(row)) );
        }
        return bodyRows;
    }


}


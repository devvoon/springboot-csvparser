package example.kakaopay.controller;

import example.kakaopay.service.CsvFileUploadService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CsvFileUploadController {

    private final CsvFileUploadService csvFileUploadService;

    @PostMapping("/file/upload")
    public CreateCsvFileResponse uploadCsvFile(){

        String fileName = csvFileUploadService.upload();
        return new CreateCsvFileResponse(fileName);
    }

    @Data
    @AllArgsConstructor
    static class CreateCsvFileResponse {
        private String fileName;
    }

}

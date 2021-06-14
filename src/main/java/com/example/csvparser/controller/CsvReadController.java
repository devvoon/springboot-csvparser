package com.example.csvparser.controller;

import com.example.csvparser.service.CsvReadService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CsvReadController {

    private final CsvReadService csvReadService;

    @GetMapping("file/read")
    public String readCsvFile(){
        return "";
    }

}

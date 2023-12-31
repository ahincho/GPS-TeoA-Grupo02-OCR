package com.unsa.ocr.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import com.unsa.ocr.application.services.TesseractService;

@RestController
public class TesseractController {

    @Autowired
    private TesseractService tesseractService;

    @PostMapping("/ocr")
    public String recognizeText(@RequestParam("file") MultipartFile file) throws IOException {
        return tesseractService.recognizeText(file.getInputStream());
    }

}

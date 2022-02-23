package com.example.isthesiteup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLCheckController {
    @GetMapping("/check")
    public String getUrlStatusMessage(String url) {

        return "";
    }    
}

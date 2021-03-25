package com.app.swansonlyzer.controller;

import com.app.swansonlyzer.service.Analyzer;
import com.app.swansonlyzer.service.QuotesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RonSwansonController {

    private final Analyzer analyzer;
    private final QuotesProvider quotesProvider;

    @Autowired
    RonSwansonController(final Analyzer analyzer, final QuotesProvider quotesProvider) {
        this.analyzer = analyzer;
        this.quotesProvider = quotesProvider;
    }


    @GetMapping("/ron")
    public ArrayList<String> analyzeRon() throws Exception {
        String solution = quotesProvider.connectAndGetAmazingQuote();
        return analyzer.analyse(solution);
    }
}

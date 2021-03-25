package com.app.swansonlyzer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzerTest {

    private Analyzer analyzer;

    @BeforeEach
    void setup() {
        analyzer = new Analyzer();
    }


    @Test
    @DisplayName("should throw IllegalArgumentException when string is null \uD83D\uDE31 ")
    void test1() {
        String test = null;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> analyzer.analyse(test));
        assertEquals("Null argument", exception.getMessage());
    }

}
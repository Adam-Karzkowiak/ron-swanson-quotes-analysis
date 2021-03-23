package com.app.swansonlyzer.service;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class QuotesProvider {

    public String connectAndGetAmazingQuote() throws Exception {
        URL url = new URL(Constants.RON_SWANSON_QUOTES_URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        String solution = content.toString();
        solution = solution.replaceAll("[\\[\\]\"]", "");
        return solution;
    }
}

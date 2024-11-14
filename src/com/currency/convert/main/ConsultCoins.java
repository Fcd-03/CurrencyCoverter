package com.currency.convert.main;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultCoins {

    public Currentcy showTrade(String basecode, String targetcode) {

        URI link = URI.create("https://v6.exchangerate-api.com/v6/99b5587dcdcfbff0acb5b853/pair/"+basecode+"/"+targetcode);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Currentcy.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Its hasn't possible to realized the conversion");
        }




    }


}

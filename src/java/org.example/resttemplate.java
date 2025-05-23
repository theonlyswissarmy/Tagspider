package org.example;



import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.HttpComponentsClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.*;
import com.fasterxml.jackson.databind.*;
import reactor.netty.http.client.HttpClient;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class resttemplate {
    String apikey = "";
    ObjectMapper mapper = new ObjectMapper();

    String token = "temp";
    HttpClient httpClient = HttpClient.create();


    WebClient ourclient =WebClient.builder()
            .baseUrl("https://musicbrainz.org/ws/2/")
            .clientConnector(new ReactorClientHttpConnector(httpClient))
            .build();
    public String getlasttoken(){
        String json = ourclient.get().uri("/?method=auth.gettoken&api_key=1beb6c3c595ef5c272efba695dd6c465&format=json")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return json;



    }
}

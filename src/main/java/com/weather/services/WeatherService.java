package com.weather.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.weather.entity.WeatherData;

import reactor.core.publisher.Mono;

@Service
public class WeatherService {
	private final WebClient.Builder webClientBuilder;

    @Value("${openweather.api.key}")
    private String apiKey;
    
    @Value("${openweather.api.units}")
    private String units;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Mono<WeatherData> getWeatherData(String city) {
        return webClientBuilder.build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", city)
                        .queryParam("appid", apiKey)
                        .queryParam("units", units)
                        .build())
                .retrieve()
                .bodyToMono(WeatherData.class);
    }
}

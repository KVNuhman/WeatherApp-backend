package com.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.WeatherData;
import com.weather.services.WeatherService;

import reactor.core.publisher.Mono;

@RestController
//@RequestMapping("/weather")
public class WeatherController {
	private final WeatherService weatherService;

    public WeatherController(WeatherService openWeatherService) {
        this.weatherService = openWeatherService;
    }
    

    @GetMapping("/weather")
    public Mono<WeatherData> getWeatherData(@RequestParam("city") String city) {
        return weatherService.getWeatherData(city);
    }

}

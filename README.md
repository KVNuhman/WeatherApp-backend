# WeatherApp-backend

## Overview
Weather App is a Spring Boot project that fetches weather data from the OpenWeather API and provides the data as a JSON response. It uses WebClient to perform the API call and retrieve weather information for a given city.

## Prerequisites
- Java 17 installed on your machine.
- Maven installed to build and run the project.

## Getting Started
Follow the steps below to set up and run the Weather App locally.
1. Clone the repository:
2. Provide the OpenWeather API Key:
  - Replace `openweather_api_key` in `application.properties` with your actual OpenWeather API key.
3. Build the project:
4. Run the application:
5. Access the API:

Replace `{city}` with the name of the city for which you want to get the weather data.

## API Endpoint
The Weather App provides a single API endpoint to get weather data for a specific city:

- **Endpoint:** `/weather/{city}`
- **Method:** GET
- **Parameters:** `{city}` (required) - The name of the city for which you want to get weather data.
- **Response:** JSON data containing weather information for the specified city.

## Technologies Used
- Spring Boot: Framework for building Spring applications.
- WebClient: Non-blocking web client to perform API calls.
- JSON: Data format for API responses.

## Contact
For any questions or inquiries, feel free to contact the project owner: Your Name kvnuhman@gmail.com.



package rd.com.web.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class WeatherApiClient {

    private final String API_KEY = "6d519d050ce51208144c63529438d0a4";

    public WeatherData getWeatherData(String city, String country) throws JsonProcessingException {
        city = city.replace(" ", "+");
        country = country.replace(" ", "+");
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country
                + "&appid=6d519d050ce51208144c63529438d0a4";

        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = restTemplate.getForObject(url, String.class);
        ObjectMapper mapper = new ObjectMapper();
        WeatherData weatherData = mapper.readValue(jsonResponse, WeatherData.class);
        return weatherData;
    }
}

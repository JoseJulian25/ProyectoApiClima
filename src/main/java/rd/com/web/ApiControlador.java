package rd.com.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rd.com.web.weather.WeatherApiClient;
import rd.com.web.weather.WeatherData;

@Controller
public class ApiControlador {

    @PostMapping("/weather")
    public String informacionClima(@RequestParam String city, @RequestParam String country, Model model) throws JsonProcessingException {
        WeatherData weatherData = new WeatherApiClient().getWeatherData(city, country);
        model.addAttribute("weatherData", weatherData);
        return "weatherData";
    }
}

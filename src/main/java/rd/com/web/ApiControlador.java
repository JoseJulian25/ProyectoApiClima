package rd.com.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rd.com.apiClient.LocationApiClient;
import rd.com.apiClient.WeatherApiClient;
import rd.com.location.LocationData;
import rd.com.weather.WeatherData;

@Controller
public class ApiControlador {

    @GetMapping("/")
    public String inicio(Model model) throws JsonProcessingException{
        LocationData locationData = new LocationApiClient().getLocationData();
        model.addAttribute("locationData", locationData);
        return "index";
    }
    
    @PostMapping("/weather")
    public String informacionClima(@RequestParam String city, @RequestParam String country, Model model) throws JsonProcessingException {
        WeatherData weatherData = new WeatherApiClient().getWeatherData(city, country);
        model.addAttribute("weatherData", weatherData);
        return "weatherData";
    }
}

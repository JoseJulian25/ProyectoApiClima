package rd.com.web.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherData {
    private Main main;
    private List<Weather> wheather;
    private String name;
}

package rd.com.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherData {
    private Main main;
    private List<Weather> weather;
    private String name;
}

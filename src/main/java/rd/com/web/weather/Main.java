package rd.com.web.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Main {
    private double temp;
    private int presion;
    private int humedad;
}

package rd.com.web.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Weather {
    private String main;
    private String descripcion;
    private String icon;
}

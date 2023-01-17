package rd.com.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Main {
    private double temp;
    private int pressure;
    private int humidity;
    
    public int getTemp(){
        this.temp = this.temp - 273;
        int tempInt = (int) Math.round(this.temp);
        return tempInt;
    }
}

package rd.com.apiClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;
import rd.com.location.LocationData;

public class LocationApiClient {
    private static final String URL = "https://countriesnow.space/api/v0.1/countries";
    
    public LocationData getLocationData() throws JsonProcessingException{
        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = restTemplate.getForObject(URL, String.class);
        
        ObjectMapper mapper = new ObjectMapper();
        LocationData location = mapper.readValue(jsonResponse, LocationData.class);
        return location;
    }
}

package rd.com;

public class prueba {
    public static void main(String[] args) {
        String country = "Republica Dominicana";
        country = country.replace(" ", "%20");
        String ciudad = "Santo Domingo";
        ciudad = ciudad.replace(" ", "%20");
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + ciudad + ","+ country +"&appid=6d519d050ce51208144c63529438d0a4";    
        System.out.println(url);
    }
}

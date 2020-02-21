package begennerjava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Now time is "+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String fTime = time.format(formatter);
        System.out.println("Format time "+fTime);
    }
  
}

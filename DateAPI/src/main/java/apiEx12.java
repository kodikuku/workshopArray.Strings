import java.time.*;
import java.time.format.DateTimeFormatter;

public class apiEx12 {
    public static void main(String[] args) {
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime ltt = LocalTime.now();
        String formT = 	FOMATTER.format(ltt);
        System.out.println(formT);

    }
}

import java.time.*;
public class apiEx13 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime);
    }
}

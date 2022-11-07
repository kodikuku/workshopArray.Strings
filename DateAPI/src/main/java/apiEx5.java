import java.time.*;
public class apiEx5 {
    public static void main(String[] args) {
        DayOfWeek dow = LocalDate.parse("1945-05-08").getDayOfWeek();
        System.out.println(dow);
    }
}

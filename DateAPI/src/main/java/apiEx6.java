import java.time.*;
public class apiEx6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now().plusYears(10).minusMonths(10);
        Month month = localDate.getMonth();
        System.out.println(month);
    }
}

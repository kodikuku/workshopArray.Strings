import java.time.*;
public class apiEx7 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now().plusYears(10).minusMonths(10);
        LocalDate dateOfBirth = LocalDate.parse("1993-07-27");

        int years = Period.between(dateOfBirth,localDate).getYears();
        int months = Period.between(dateOfBirth, localDate).getMonths();
        int days = Period.between(dateOfBirth, localDate).getDays();
        System.out.println(years + " years " + months + " Months "  + days + " Days");
    }
}

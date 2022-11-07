import java.time.*;
public class apiEx10 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        int nano = instant.getNano();
        System.out.println(nano);
    }
}

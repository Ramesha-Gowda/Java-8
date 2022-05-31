package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);
        long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diff : "+diff);

        Duration duration = Duration.between(localTime,localTime1);//its compatible only with localtime
        System.out.println("toMinutes : "+duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toMinutes : "+duration1.toMinutes());

//       Duration duration2 = Duration.between(LocalDate.now(),LocalDate.now().plusDays(10));
//        System.out.println("Not compatible with Dates : "+duration2);
    }
}

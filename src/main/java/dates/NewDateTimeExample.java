package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : "+localDate);

        //LocalTime
        LocalTime localTime=LocalTime.now();
        System.out.println("Local Time"+localTime);

        //LocalDateAndTime
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("LocalDateTime "+localDateTime);
    }
}

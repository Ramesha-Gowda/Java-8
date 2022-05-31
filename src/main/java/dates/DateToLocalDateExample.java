package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {

        /**
         * java.util.Date to LocalDate and Vice Versa
         */
        Date date = new Date();
        System.out.println("date : "+date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("localDate: "+localDate);

//        Date date1 = new Date()
//                .from(Instant.from(localDate.atTime(LocalTime.now()))).atZone(ZoneId.systemDefault()).toInstant();

//        System.out.println("date1 : "+date1);

        /**
         * java.sql.Date to LocalDate and Vice Versa
         */

        java.sql.Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println("date2 : "+date2);

        LocalDate localDate1 = date2.toLocalDate();
        System.out.println("localDate1 : "+localDate1);



    }
}

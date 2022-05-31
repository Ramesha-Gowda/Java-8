package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date : "+localDate);

        LocalDate localDate1=LocalDate.of(2018,07,17);
        System.out.println("Local Date1 : "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018,365);
        System.out.println("Local Date2 : "+localDate2);

        /**
         * Get Values from localDate
         */
        System.out.println("getMonth : "+localDate.getMonth());
        System.out.println("getMonthValue : "+localDate.getMonthValue());
        System.out.println("getDayOfWeek : "+localDate.getDayOfWeek());
        System.out.println("getDayOfYear : "+localDate.getDayOfYear());
        System.out.println("Day of month using get : "+localDate.get(ChronoField.DAY_OF_MONTH));
        /**
         * Modifying Local Date
         */

        System.out.println("CurrentDate + 2days = plusDays : "+localDate.plusDays(2));
        System.out.println("CurrentDate + 2month = plusMonths : "+localDate.plusMonths(2));
        System.out.println("minusDays : "+localDate.minusDays(2));
        System.out.println("withYear : "+localDate.withYear(2023));
        System.out.println("with chronoField"+localDate.with(ChronoField.YEAR,2025));
//        System.out.println("with TemporalAdjuster"+localDate.with(TemporalAdjuster.firstDayOfNextMonth()));

        System.out.println("Subtract year by one using ChronoUnit minus : "+localDate.minus(1, ChronoUnit.YEARS));
//        System.out.println(localDate.minusYears(1));

        /**
         * Additional Support methods
         */
        System.out.println("leapYear : "+ localDate.isLeapYear());
        System.out.println("leapYear : "+ LocalDate.ofYearDay(2022,2).isLeapYear());

        //localdate = 2022-05-30
        //localdate1 = 2018-07-17
        System.out.println("isEqual : "+localDate.isEqual(localDate1));
        System.out.println("isBefore : "+localDate.isBefore(localDate1));
        System.out.println("isAfter : "+localDate.isAfter(localDate1));

        /**
         * Unsupported
         */

//        System.out.println("chronounit minus : "+
//                localDate.minus(1,ChronoUnit.MINUTES));
        System.out.println("isSupported : "+localDate.isSupported(ChronoUnit.YEARS));
    }

}


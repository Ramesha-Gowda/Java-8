package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FromattingLocalDateExample {

    /**
     * String to LocalDate
     */
    public static void parseLocalDate(){
        String date = "2022-05-31";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate : "+localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 : "+localDate1);

        String date1 = "20220428";//yyyyMMdd

        LocalDate localDate2 = LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 : "+localDate2);

        /**
         * Custom define dateFormatter
         */

        String date2 = "2022|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter);
        System.out.println("localDate3 : "+localDate3);

        String date3 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3,dateTimeFormatter1);
        System.out.println("localDate4 : "+localDate4);

    }

    /**
     * LocalDate to String
     */
    public static void formatLocalDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : "+formattedDate);

    }
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}

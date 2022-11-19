package java_turkce_date_time_soru_cozumleri;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Soru10 {
    public static void main(String[] args) {

        LocalDate countDate = LocalDate.of(2020,10,8);
        System.out.println(countDate);
        LocalTime countTime = LocalTime.of(03,00,00 );
        DateTimeFormatter onIki = DateTimeFormatter.ofPattern("hh:mm a");
        String formatZaman = onIki.format(countTime);
        System.out.println(formatZaman);



        System.out.println();

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(dtf.format(countTime.plusHours(1)));















    }
}

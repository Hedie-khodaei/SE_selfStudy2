package session4;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main1 {
    public static void main(String[] args) {
        LocalDate birthday;
        birthday = LocalDate.of(2000,11,10);
        System.out.println(birthday);

        LocalDate Date = LocalDate.now();
        System.out.println(Date);

        LocalTime savedTime = LocalTime.of(20,15,50,789);
        System.out.println(savedTime);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime docTime = LocalDateTime.of(2000,11,10,20,15,50,789);
        System.out.println(docTime.minusDays(200).plusHours(400).minusMonths(8).plusMinutes(3000));


        String name = "Hedie";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(true);
    }
}

package ora3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EnumDatumok {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level e1 = Level.MEDIUM;
        System.out.println(e1);

        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatteddate = date1.format(formatter);
        System.out.println(formatteddate);

        LocalDate date = LocalDate.of(2022,9,22);
        LocalDateTime dateTime = date.atTime(15,21);
        System.out.println(dateTime);
        String input = "2022-09-22";
        LocalDate date2 = LocalDate.parse(input);
        System.out.println(date2);

        LocalDateTime dateTime1 = LocalDateTime.of(2022,9,22,15,24);
        LocalDateTime datetime2 = dateTime1.plusMinutes(250);
        System.out.println(datetime2);

    }
}

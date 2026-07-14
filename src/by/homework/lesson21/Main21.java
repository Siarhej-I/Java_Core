package by.homework.lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main21 {
    public static void main(String[] args) {

        /*1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String*/
        LocalDate localDate1 = LocalDate.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String resultLD = localDate1.format(dtf1);
        System.out.println("1. Текущая дата по шаблону '1 апреля 2023' - " + resultLD);

        /*2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String*/
        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss a");
        String resultLDT = localDateTime1.format(dtf2);
        System.out.println("2. Текущая дата по шаблону '1 апреля 2023, 10:59:20 PM' - " + resultLDT);

        /*3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию: */
        String stringDate1 = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime resultStr1 = LocalDateTime.parse(stringDate1,dtf3);
        System.out.println("3. String '2023-03-19 : 10:12:24 AM' в формате LocalDateTime по умолчанию - " + resultStr1);

        /*4. Перевести String (пн 20.03.23 г. время: 15:07:28  ) в формат LocalDateTime по умолчанию: */
        String stringDate2 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("eee dd.MM.yy 'г. время:' HH:mm:ss");
        LocalDateTime resultStr2 = LocalDateTime.parse(stringDate2,dtf4);
        System.out.println("4. String 'пн 20.03.23 г. время: 15:07:28' в формате LocalDateTime по умолчанию - " + resultStr2);

        /*5. *Вывести текущую дату в формате (пример формата: понедельник 20 марта 2023 время: 11.54.06 PM).
        На выходе дата должна быть класса String*/
        LocalDateTime localDateTime5 = LocalDateTime.now();
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy 'время:' hh:mm:ss a");
        String resultLDT5 = localDateTime5.format(dtf5);
        System.out.println("5. Текущая дата по шаблону 'понедельник 20 марта 2023 время: 11.54.06 PM' - " + resultLDT5);

    }
}

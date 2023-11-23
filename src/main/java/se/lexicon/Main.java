package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //exercise_1();
        //exercise_2();
        //exercise_3();
        //exercise_4();
        //exercise_5();
        //exercise_6();
        //exercise_7();
        //exercise_8();
        //exercise_9();
        //exercise_10();
        //exercise_11();
        //exercise_12();
        //exercise_13();
        exercise_14();

    }

    public static void exercise_1() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }

    public static void exercise_2() {
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("eeee dd MMM")));

    }

    public static void exercise_3() {
        LocalDate lastMonday = LocalDate.parse("2023-11-13");
        for (int i = 0; i <= 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
    }
    public static void exercise_4() {
        String datumString ="1994-04-07";
        LocalDate datum =LocalDate.parse(datumString);
    }

    public static void exercise_5() {
        LocalDate date =LocalDate.of(1945,5,8);
        System.out.println(date.getDayOfWeek());
    }

    public static void exercise_6() {
        LocalDate today = LocalDate.now();
        System.out.println(today.plusYears(10).minusMonths(10).getMonth());
    }
    public static void exercise_7() {

    }
    public static void exercise_8(){
        Period period =Period.of(4, 7, 29);
        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plus(period);
    }
    public static void exercise_9() {
        LocalTime currentTime = LocalTime.now();
    }
    public static void exercise_10() {
        LocalTime currentTime = LocalTime.now().truncatedTo(ChronoUnit.NANOS);
        System.out.println(currentTime.getNano());
    }
    public static void exercise_11() {
        String timeString ="12:00";
        LocalTime time = LocalTime.parse(timeString);
    }
    public static void  exercise_12() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("10:32:53");
        System.out.println(currentTime.format(formatter));

    }
    public static void  exercise_13() {
        LocalDateTime dateTime = LocalDateTime.of(2018,4,5,10,0);
    }

}
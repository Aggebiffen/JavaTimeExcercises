package se.lexicon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //exercise_1();
        //exercise_2();
        //exercise_3();
        exercise_4();


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

    }
}
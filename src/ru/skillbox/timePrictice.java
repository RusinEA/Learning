package ru.skillbox;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class timePrictice {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(10, 20));
        LocalTime catSaidMeowAt = LocalTime.of(10, 30, 45);
        System.out.println(catSaidMeowAt);
        LocalTime experimentEndedAt = LocalTime.of(10, 30, 45, 560900778);
        System.out.println(experimentEndedAt);

        LocalTime lessonStartsAt = LocalTime.of(10, 45);
        LocalTime lessonsEndsAt = LocalTime.of(11, 55);
        System.out.println(lessonStartsAt + " - " + lessonsEndsAt);

        long hour = lessonStartsAt.until(lessonsEndsAt, ChronoUnit.HOURS);
        System.out.println("Лекция длится полных " + hour + "ч.");

        long lectionMinutes = lessonStartsAt.until(lessonsEndsAt, ChronoUnit.MINUTES);
        System.out.println("Лекция длится всего " + lectionMinutes + "мин.");

        long minutesOfHour = lectionMinutes - hour * 60;
        System.out.println("Лекция длится " + hour + "ч. и " + minutesOfHour + "мин.");

        Duration lessonDuration = Duration.between(lessonStartsAt, lessonsEndsAt);
        System.out.println(lessonDuration);
        System.out.println(lessonDuration.toHoursPart());
        System.out.println(lessonDuration.toMinutesPart());
        System.out.println(lessonDuration.toHours());
        System.out.println(lessonDuration.toMinutes());

        Duration oneCircleTime = Duration.ofMinutes(2).plusSeconds(30);
        Duration runningDuration = Duration.ofMinutes(21);
        long circleAmount = runningDuration.dividedBy(oneCircleTime);
        System.out.println("Атлет пробежал полных кругов:" + circleAmount);

        Duration oneCircleDuration = runningDuration.dividedBy(9);
        System.out.println("Атлет пробежал один круг за " + oneCircleDuration);

        LocalDate sputnikOneLaunchDate = LocalDate.of(1957, Month.OCTOBER, 4);
        LocalTime sputnikOneLaunchTime = LocalTime.of(22,28,34);

        LocalDateTime sputnikOneLaunchAt = LocalDateTime.of(sputnikOneLaunchDate, sputnikOneLaunchTime);
        LocalDateTime now = LocalDateTime.now();


        //Вычисления с помощью периода, не точные дни

        Period period = Period.between(sputnikOneLaunchAt.toLocalDate(),
                now.toLocalDate());

        int periodYears = period.getYears();
        int periodMonths = period.getMonths();
        int periodDays = period.getDays();

        System.out.println("лет:" + periodYears);
        System.out.println("месяцев:" + periodMonths);
        System.out.println("дней:" + periodDays);

        //Вычисления с промощью ChronoUnit
        System.out.println();
        System.out.println("----Chrono----");
        System.out.println();
        long years = ChronoUnit.YEARS.between(
                sputnikOneLaunchAt, now);
        LocalDateTime reducedDateTime =
                sputnikOneLaunchAt.plusYears(years);

        long months = ChronoUnit.MONTHS.between(reducedDateTime, now);
        reducedDateTime = sputnikOneLaunchAt.plusMonths(months);

        long days = ChronoUnit.DAYS.between(reducedDateTime, now);
        reducedDateTime = reducedDateTime.plusDays(days);

        long hours = ChronoUnit.HOURS.between(reducedDateTime, now);
        reducedDateTime = reducedDateTime.plusHours(hours);

        long minutes = ChronoUnit.MINUTES.between(reducedDateTime, now);
        reducedDateTime = reducedDateTime.plusMinutes(minutes);

        long seconds = ChronoUnit.SECONDS.between(reducedDateTime, now);

// Вывод разницы
        System.out.println("года: " + years);
        System.out.println("месяцы: " + months);
        System.out.println("дни: " + days);
        System.out.println("часы: " + hours);
        System.out.println("минуты: " + minutes);
        System.out.println("секунд: " + seconds);
    }
}


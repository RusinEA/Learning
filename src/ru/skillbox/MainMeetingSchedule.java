package ru.skillbox;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MainMeetingSchedule {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2050, Month.MARCH, 17);

        DateTimeFormatter fromatterForWeekDay = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE"); //EE - вывод дня недели

        System.out.println("Начальная дата: " + startDate.format(fromatterForWeekDay));

        LocalDate nextThursday = findNearestThursdayFrom(startDate);

        System.out.println(nextThursday.format(fromatterForWeekDay));

        LocalDate endOfEvents = startDate
                .plusMonths(1)
                .plusWeeks(2);

        System.out.println(endOfEvents.format(fromatterForWeekDay));

        LocalDate nextMeetingAt = nextThursday;

        while (nextMeetingAt.isBefore(endOfEvents)) {
            System.out.println("Встреча: " + nextMeetingAt.format(fromatterForWeekDay));
            nextMeetingAt = nextMeetingAt.plusWeeks(1);
        }

    }

    private static LocalDate findNearestThursdayFrom(LocalDate date) {
        LocalDate nextDay = date;

        while (!nextDay.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
            nextDay = nextDay.plusDays(1);
        }
        return nextDay;
    }

}

package ru.netology.service;

public class LeapYear {
    public static boolean calculateLeapYear (int year, int countDays){
        if (year % 400 == 0){
            if (countDays == 366) {
                return (true);
            }
        } else if (year % 4 == 0 && year % 100 != 0 && year != 2100){
            if (countDays == 366) {
                return (true);
            }
        }
        else {
            if (countDays == 365) {
                return (true);
            }
        }
        return (false);
    }

}

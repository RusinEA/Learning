package ru.netology.service;

public class LeapYear {
    public static boolean calculateLeapYear (int year, int count){
        return (countDays(year) == count);
    }

    public static int countDays (int year){
        if (year % 400 == 0){
            return (366);
        } else if (year % 4 == 0 && year % 100 != 0 && year != 2100){
            return (366);
          }
        else {
            return (365);
        }
    }

}

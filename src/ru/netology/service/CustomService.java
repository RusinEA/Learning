package ru.netology.service;

public class CustomService {
    public static double calculateCustoms(int price, int weight) {
        return (0.01 * price) + weight * 100;
    }
}


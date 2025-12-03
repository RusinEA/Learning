package ru.netology.service;

public class CustomService {

    static final double PENNY_PER_RUB = 0.01;
    static final int RUB_PER_KG = 100;

    public static double calculateCustoms(int price, int weight) {
        return (PENNY_PER_RUB * price) + weight * RUB_PER_KG;
    }
}


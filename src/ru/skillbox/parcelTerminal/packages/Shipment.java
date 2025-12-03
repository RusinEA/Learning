package ru.skillbox.parcelTerminal.packages;

import ru.skillbox.parcelTerminal.dimensions.Dimensions;

import java.math.BigDecimal;

public record Shipment (Dimensions dimensions, BigDecimal weight, String description){

    @Override
    public String toString() {
        return "Shipment" + dimensions.toString() + " Вес " + weight + ", наименование: " + description;
    }
}

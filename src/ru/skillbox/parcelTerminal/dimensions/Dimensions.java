package ru.skillbox.parcelTerminal.dimensions;

public record Dimensions(int length, int width, int height) {

    public boolean canItFit(Dimensions dimensions) {
        return dimensions.length < this.length && dimensions.width <= this.width && dimensions.height <= this.height;
    }

}

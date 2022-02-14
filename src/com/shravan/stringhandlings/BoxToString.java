package com.shravan.stringhandlings;

public class BoxToString {
    double width;
    double height;
    double depth;

    public BoxToString(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

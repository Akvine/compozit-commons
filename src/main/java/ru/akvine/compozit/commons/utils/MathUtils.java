package ru.akvine.compozit.commons.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtils {
    public double round(double value) {
        return round(value, 2);
    }

    public double round(double value, int roundAccuracy) {
        return Math.round(value * Math.pow(10, roundAccuracy)) / Math.pow(10, roundAccuracy);
    }
}

package com.ruslooob.easy.convert_the_temperature;

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{
                celsius + 273.15,
                celsius * 1.8 + 32
        };
    }
}
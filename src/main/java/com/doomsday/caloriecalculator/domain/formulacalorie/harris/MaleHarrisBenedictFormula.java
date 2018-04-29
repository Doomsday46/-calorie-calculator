package com.doomsday.caloriecalculator.domain.formulacalorie.harris;


import com.doomsday.caloriecalculator.domain.formulacalorie.CalorieFormula;

public class MaleHarrisBenedictFormula implements CalorieFormula {

    @Override
    public double getCountCalorie(Double weight, Double height, Integer age) {
        if(weight < 0 || height < 0 || age < 0 ) throw new IllegalArgumentException();
        Double coef = 66.47;
        Double coefWeight = 13.75;
        Double coefHeight = 5.0;
        Double coefAge = 6.74;
        return (coef + coefWeight * weight + coefHeight * height) - (coefAge * age);
    }
}

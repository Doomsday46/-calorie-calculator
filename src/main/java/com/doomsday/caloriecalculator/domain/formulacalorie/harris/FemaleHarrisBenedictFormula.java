package com.doomsday.caloriecalculator.domain.formulacalorie.harris;

import com.doomsday.caloriecalculator.domain.formulacalorie.CalorieFormula;

public class FemaleHarrisBenedictFormula implements CalorieFormula {

    @Override
    public double getCountCalorie(Double weight, Double height,Double activity , Integer age) {
        if(weight < 0 || height < 0 || age < 0) throw new IllegalArgumentException();
        Double coef = 655.1;
        Double coefWeight = 9.6;
        Double coefHeight = 1.85;
        Double coefAge = 4.68;
        return ((coef + coefWeight * weight + coefHeight * height) - (coefAge * age))*activity;
    }

}

package com.doomsday.caloriecalculator.domain.formulacalorie.harris;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;

public class FormulaHarrisBenedictWomen implements FormulaCalorie {

    private final Double coef = 655.1;
    private final Double coefWeight = 9.6;
    private final Double coefHeight = 1.85;
    private final Double coefAge = 4.68;

    @Override
    public double getCountCalorie(Double weight, Double height, Integer age) {
        return (coef + coefWeight * weight + coefHeight * height) - (coefAge * age);
    }

}

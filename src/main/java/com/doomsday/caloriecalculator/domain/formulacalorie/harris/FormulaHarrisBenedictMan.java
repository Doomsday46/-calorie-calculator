package com.doomsday.caloriecalculator.domain.formulacalorie.harris;


import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;

public class FormulaHarrisBenedictMan implements FormulaCalorie {

    private final Double coef = 66.47;
    private final Double coefWeigth = 13.75;
    private final Double coefHeigth = 5.0;
    private final Double coefAge = 6.74;

    @Override
    public double getCountCalorie(Double weigth, Double heigth, Integer age) {
        return (coef + coefWeigth * weigth + coefHeigth * heigth) - (coefAge * age);
    }
}

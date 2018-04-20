package com.doomsday.caloriecalculator.domain.formulacalorie.maffina;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;

public class FormulaMaffinaJeoraWomen implements FormulaCalorie {

    @Override
    public double getCountCalorie(Double weight, Double height, Integer age) {
        return 9.99 * weight + 6.25 *height - 4.92 * age - 161;
    }
}

package com.doomsday.caloriecalculator.domain.formulacalorie.maffina;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;

public class FormulaMaffinaJeoraMan implements FormulaCalorie{

    @Override
    public double getCountCalorie(Double weight, Double height, Integer age) {
        if(weight < 0 || height < 0 || age < 0) throw new IllegalArgumentException();
        return 9.99 * weight + 6.25 *height - 4.92 * age + 5;
    }
}

package com.doomsday.caloriecalculator.domain.formulacalorie.harris;

import com.doomsday.caloriecalculator.domain.formulacalorie.CalorieFormula;
import com.doomsday.caloriecalculator.domain.formulacalorie.GenderFormulaStrategy;


public class HarrisFormulaGenderStrategy implements GenderFormulaStrategy {

    @Override
    public CalorieFormula getFormula(String gender) {
        if(gender.equals("women")) return new FemaleHarrisBenedictFormula();
        if(gender.equals("man")) return new MaleHarrisBenedictFormula();
        return null;
    }
}

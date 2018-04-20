package com.doomsday.caloriecalculator.domain.formulacalorie.harris;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;
import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaGenderFactory;


public class HarrisFormulaGenderFactory implements FormulaGenderFactory {

    @Override
    public FormulaCalorie getFormula(String gender) {
        if(gender.equals("women")) return new FormulaHarrisBenedictWomen();
        if(gender.equals("man")) return new FormulaHarrisBenedictMan();
        return null;
    }
}

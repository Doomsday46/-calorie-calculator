package com.doomsday.caloriecalculator.domain.formulacalorie.maffina;

import com.doomsday.caloriecalculator.domain.formulacalorie.CalorieFormula;
import com.doomsday.caloriecalculator.domain.formulacalorie.GenderFormulaStrategy;

public class MaffinaGenderFormulaStrategy implements GenderFormulaStrategy {


    @Override
    public CalorieFormula getFormula(String gender) {
        if(gender.equals("women")) return new FemaleMaffinaJeoraFormula();
        if(gender.equals("man")) return new MaleMaffinaJeoraFormula();
        return null;
    }
}

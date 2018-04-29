package com.doomsday.caloriecalculator.domain.formulacalorie;

import com.doomsday.caloriecalculator.domain.formulacalorie.harris.HarrisFormulaGenderStrategy;
import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.MaffinaGenderFormulaStrategy;

public class CalorieFormulaBOO implements CalorieFormulaFactory {

    @Override
    public CalorieFormula getFormulaCalorie(String typeFormula, String gender) {
        if(typeFormula.equals("harris")) return new HarrisFormulaGenderStrategy().getFormula(gender);
        if(typeFormula.equals("maffina")) return new MaffinaGenderFormulaStrategy().getFormula(gender);
        return null;
    }
}

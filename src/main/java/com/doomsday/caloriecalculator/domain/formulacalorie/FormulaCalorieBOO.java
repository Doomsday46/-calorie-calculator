package com.doomsday.caloriecalculator.domain.formulacalorie;

import com.doomsday.caloriecalculator.domain.formulacalorie.harris.HarrisFormulaGenderFactory;
import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.MaffinaFormulaGenderFactory;

public class FormulaCalorieBOO implements  FormulaCalorieFactory{

    @Override
    public FormulaCalorie getFormulaCalorie(String typeFormula,String gender) {
        if(typeFormula.equals("harris")) return new HarrisFormulaGenderFactory().getFormula(gender);
        if(typeFormula.equals("maffina")) return new MaffinaFormulaGenderFactory().getFormula(gender);
        return null;
    }
}

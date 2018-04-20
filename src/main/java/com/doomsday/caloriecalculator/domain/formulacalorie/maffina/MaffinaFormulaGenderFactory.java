package com.doomsday.caloriecalculator.domain.formulacalorie.maffina;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorie;
import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaGenderFactory;

public class MaffinaFormulaGenderFactory implements FormulaGenderFactory{


    @Override
    public FormulaCalorie getFormula(String gender) {
        if(gender.equals("women")) return new FormulaMaffinaJeoraWomen();
        if(gender.equals("man")) return new FormulaMaffinaJeoraMan();
        return null;
    }
}

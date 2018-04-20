package com.doomsday.caloriecalculator.domain.formulacalorie;

public interface FormulaCalorieFactory {
    FormulaCalorie getFormulaCalorie(String typeFormula,String gender);
}

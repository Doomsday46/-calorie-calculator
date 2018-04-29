package com.doomsday.caloriecalculator.domain.formulacalorie;

public interface CalorieFormulaFactory {
    CalorieFormula getFormulaCalorie(String typeFormula, String gender);
}

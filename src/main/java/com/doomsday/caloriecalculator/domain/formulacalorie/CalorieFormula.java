package com.doomsday.caloriecalculator.domain.formulacalorie;

public interface CalorieFormula {
    double getCountCalorie(Double weight, Double height,Double activity, Integer age);
}

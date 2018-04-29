package com.doomsday.caloriecalculator.service;

import com.doomsday.caloriecalculator.domain.formulacalorie.CalorieFormulaBOO;
import org.springframework.stereotype.Service;

@Service
public class FormulaCalorieService {

   public Double calculateCalorie(String formula, Double weight,Double height,Integer age,String gender){
       return new CalorieFormulaBOO().getFormulaCalorie(formula,gender).getCountCalorie(weight,height,age ) * 1.2;
   }
}

package com.doomsday.caloriecalculator.Service;

import com.doomsday.caloriecalculator.domain.formulacalorie.FormulaCalorieBOO;
import org.springframework.stereotype.Service;

@Service
public class FormulaCalorieService {

   public Double calculateCalorie(String formula, Double weight,Double height,Integer age,String gender){
       return new FormulaCalorieBOO().getFormulaCalorie(formula,gender).getCountCalorie(weight,height,age ) * 1.2;
   }
}

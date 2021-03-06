package com.doomsday.caloriecalculator.domain;

import com.doomsday.caloriecalculator.domain.formulacalorie.harris.MaleHarrisBenedictFormula;
import org.junit.Before;
import org.junit.Test;

public class FormulaHarrisBenedicManTests {
    private MaleHarrisBenedictFormula maleHarrisBenedictFormula;

    @Before
    public void init(){
        maleHarrisBenedictFormula = new MaleHarrisBenedictFormula();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        maleHarrisBenedictFormula.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        maleHarrisBenedictFormula.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        maleHarrisBenedictFormula.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        maleHarrisBenedictFormula.getCountCalorie(74.0,179.2,21);
    }
}

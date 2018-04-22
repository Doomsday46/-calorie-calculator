package com.doomsday.caloriecalculator.domain;

import com.doomsday.caloriecalculator.domain.formulacalorie.harris.FormulaHarrisBenedictMan;
import org.junit.Before;
import org.junit.Test;

public class FormulaHarrisBenedicManTests {
    private FormulaHarrisBenedictMan formulaHarrisBenedictMan;

    @Before
    public void init(){
        formulaHarrisBenedictMan = new FormulaHarrisBenedictMan();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        formulaHarrisBenedictMan.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        formulaHarrisBenedictMan.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        formulaHarrisBenedictMan.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        formulaHarrisBenedictMan.getCountCalorie(74.0,179.2,21);
    }
}

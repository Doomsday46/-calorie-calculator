package com.doomsday.caloriecalculator.domain;

import com.doomsday.caloriecalculator.domain.formulacalorie.harris.FormulaHarrisBenedictMan;
import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FormulaMaffinaJeoraWomen;
import org.junit.Before;
import org.junit.Test;

public class FormulaHarrisBenedicWomenTests {
    private FormulaMaffinaJeoraWomen formulaHarrisBenedictWomen;

    @Before
    public void init(){
        formulaHarrisBenedictWomen = new FormulaMaffinaJeoraWomen();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        formulaHarrisBenedictWomen.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        formulaHarrisBenedictWomen.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        formulaHarrisBenedictWomen.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        formulaHarrisBenedictWomen.getCountCalorie(74.0,179.2,21);
    }
}

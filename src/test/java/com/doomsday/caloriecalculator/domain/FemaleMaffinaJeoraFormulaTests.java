package com.doomsday.caloriecalculator.domain;

import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FemaleMaffinaJeoraFormula;
import org.junit.Before;
import org.junit.Test;

public class FemaleMaffinaJeoraFormulaTests {
    private FemaleMaffinaJeoraFormula femaleMaffinaJeoraFormula;

    @Before
    public void init(){
        femaleMaffinaJeoraFormula = new FemaleMaffinaJeoraFormula();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        femaleMaffinaJeoraFormula.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        femaleMaffinaJeoraFormula.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        femaleMaffinaJeoraFormula.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        femaleMaffinaJeoraFormula.getCountCalorie(74.0,179.2,21);
    }
}

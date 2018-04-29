package com.doomsday.caloriecalculator.domain;


import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.MaleMaffinaJeoraFormula;
import org.junit.Before;
import org.junit.Test;

public class MaleMaffinaJeoraFormulaTests {

    private MaleMaffinaJeoraFormula maleMaffinaJeoraFormula;

    @Before
    public void init(){
        maleMaffinaJeoraFormula = new MaleMaffinaJeoraFormula();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        maleMaffinaJeoraFormula.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        maleMaffinaJeoraFormula.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        maleMaffinaJeoraFormula.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        maleMaffinaJeoraFormula.getCountCalorie(74.0,179.2,21);
    }
}

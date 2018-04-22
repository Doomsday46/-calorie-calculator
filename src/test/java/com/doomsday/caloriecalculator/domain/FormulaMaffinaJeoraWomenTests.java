package com.doomsday.caloriecalculator.domain;

import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FormulaMaffinaJeoraWomen;
import org.junit.Before;
import org.junit.Test;

public class FormulaMaffinaJeoraWomenTests {
    private FormulaMaffinaJeoraWomen formulaMaffinaJeoraWomen;

    @Before
    public void init(){
        formulaMaffinaJeoraWomen = new com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FormulaMaffinaJeoraWomen();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        formulaMaffinaJeoraWomen.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        formulaMaffinaJeoraWomen.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        formulaMaffinaJeoraWomen.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        formulaMaffinaJeoraWomen.getCountCalorie(74.0,179.2,21);
    }
}

package com.doomsday.caloriecalculator.domain;


import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FormulaMaffinaJeoraMan;
import com.doomsday.caloriecalculator.domain.formulacalorie.maffina.FormulaMaffinaJeoraWomen;
import org.junit.Before;
import org.junit.Test;

public class FormulaMaffinaJeoraManTests {

    private FormulaMaffinaJeoraMan formulaMaffinaJeoraMan;

    @Before
    public void init(){
        formulaMaffinaJeoraMan = new FormulaMaffinaJeoraMan();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_weight(){
        formulaMaffinaJeoraMan.getCountCalorie(-1.6,162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_height(){
        formulaMaffinaJeoraMan.getCountCalorie(26.0,-162.2,21);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetCalorie_invalidArgumets_age(){
        formulaMaffinaJeoraMan.getCountCalorie(56.0,162.2,-21);
    }

    @Test
    public void testGetCalorie(){
        formulaMaffinaJeoraMan.getCountCalorie(74.0,179.2,21);
    }
}

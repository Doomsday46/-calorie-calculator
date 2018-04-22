package com.doomsday.caloriecalculator.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        FormulaMaffinaJeoraManTests.class,
        FormulaHarrisBenedicManTests.class,
        FormulaHarrisBenedicWomenTests.class,
        FormulaMaffinaJeoraWomenTests.class
})
public class TestManager {
}

package uk.co.artran.intcalc;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class IntMathLibTest {
    private IntMathLib mathLib;

    @Before
    public void setUp()
    {
        mathLib = new IntMathLib();
    }

    @Test
    public void verifyOnePlusOne()
    {
        assertThat(mathLib.add(1, 1)).isEqualTo(2);
    }

    @Test
    public void verifyTwoTimeTwo()
    {
        assertThat(mathLib.multiply(2, 2)).isEqualTo(4);
    }

    @Test
    public void verifyFourDivideByTwo()
    {
        assertThat(mathLib.divide(4, 2)).isEqualTo(2);
    }
}

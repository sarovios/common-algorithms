package com.github.common.algorithms.problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FastPowerTest {

    @Test
    public void fastPowerTest() {
        FastPower fastPower = new FastPower();
        assertEquals(fastPower.compute(5, 5), 5*5*5*5*5);
        assertEquals(fastPower.compute(10, 6), 10*10*10*10*10*10);
        assertEquals(fastPower.compute(39102, 3), 39102*39102*39102);
    }
}

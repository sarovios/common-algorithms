package com.github.common.algorithms.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerMultiplicationTest {

    IntegerMultiplication integerMultiplication = new IntegerMultiplication();

    @Test
    public void testRecursiveTwoPositive() {
        integerMultiplication.recursive(5, 5);
        assertEquals(25, integerMultiplication.getResult());
        integerMultiplication.clear();
        integerMultiplication.recursive(1234, 5678);
        assertEquals(7006652, integerMultiplication.getResult());
    }

    @Test
    public void testRecursiveOnePositive() {
        integerMultiplication.recursive(5, -5);
        assertEquals(-25, integerMultiplication.getResult());
        integerMultiplication.clear();
        integerMultiplication.recursive(-1234, 5678);
        assertEquals(-7006652, integerMultiplication.getResult());
    }

    @Test
    public void testRecursiveTwoNegative() {
        integerMultiplication.recursive(-5, -5);
        assertEquals(25, integerMultiplication.getResult());
        integerMultiplication.clear();
        integerMultiplication.recursive(-1234, -5678);
        assertEquals(7006652, integerMultiplication.getResult());
    }

    @Test
    public void testRecursiveZero() {
        integerMultiplication.recursive(124, 0);
        assertEquals(0, integerMultiplication.getResult());
        integerMultiplication.clear();
        integerMultiplication.recursive(0, 5421);
        assertEquals(0, integerMultiplication.getResult());
        integerMultiplication.clear();
        integerMultiplication.recursive(0, 0);
        assertEquals(0, integerMultiplication.getResult());

    }
}

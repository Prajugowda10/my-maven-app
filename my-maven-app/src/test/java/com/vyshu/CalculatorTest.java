package com.vyshu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test cases for the Calculator class
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-2, calculator.subtract(3, 5));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    public void testMultiplication() {
        assertEquals(42, calculator.multiply(6, 7));
        assertEquals(0, calculator.multiply(0, 100));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}

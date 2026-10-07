package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorNegativeTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addWithNegativeOperands() {
        assertEquals(-1, calculator.add(-4, 3));
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, calculator.multiply(7, 0));
    }
}

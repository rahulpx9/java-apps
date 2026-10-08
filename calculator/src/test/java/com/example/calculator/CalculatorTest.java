package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    void multiply() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void divideByOne() {
        assertEquals(4, calculator.multiply(4, 1));
    }
}

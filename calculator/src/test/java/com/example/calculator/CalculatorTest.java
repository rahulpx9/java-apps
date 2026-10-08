package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"2,3,5", "4,3,7", "9,1,10"})
    void addsIntegers(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }
}

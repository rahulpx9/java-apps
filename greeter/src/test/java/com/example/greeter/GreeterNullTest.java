package com.example.greeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GreeterNullTest {

    @Test
    void greetRejectsNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Greeter().greet(null));
    }
}

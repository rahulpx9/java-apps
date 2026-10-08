package com.example.greeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GreeterTest {

    private final Greeter greeter = new Greeter();

    @Test
    void greetReturnsPersonalizedMessage() {
        assertEquals("Hello, Alice!", greeter.greet("Alice"));
    }


    @Test
    void greetRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> greeter.greet("   "));
    }
}

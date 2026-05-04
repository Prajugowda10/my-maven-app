package com.vyshu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test cases for the Greeter class
 */
public class GreeterTest {

    private Greeter greeter;

    @Before
    public void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void testGreetWithName() {
        assertEquals("Hello, Vyshu!", greeter.greet("Vyshu"));
    }

    @Test
    public void testGreetWithEmptyName() {
        assertEquals("Hello, Stranger!", greeter.greet(""));
    }

    @Test
    public void testGreetWithNullName() {
        assertEquals("Hello, Stranger!", greeter.greet(null));
    }

    @Test
    public void testGreetWithTime() {
        assertEquals("Good morning, Vyshu!",
            greeter.greetWithTime("Vyshu", "morning"));
        assertEquals("Good evening, Prajwal!",
            greeter.greetWithTime("Prajwal", "evening"));
    }
}

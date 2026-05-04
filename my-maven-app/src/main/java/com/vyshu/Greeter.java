package com.vyshu;

/**
 * Simple greeter class
 */
public class Greeter {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }

    public String greetWithTime(String name, String timeOfDay) {
        return "Good " + timeOfDay + ", " + name + "!";
    }
}

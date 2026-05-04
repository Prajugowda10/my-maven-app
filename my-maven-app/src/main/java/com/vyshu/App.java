package com.vyshu;

/**
 * Main application class with a simple Calculator
 * Built with Maven, deployed via Jenkins
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  Hello from my Maven app!");
        System.out.println("  Built and deployed via Jenkins");
        System.out.println("=================================");

        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 4 = " + calc.divide(20, 4));

        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("Vyshu"));
    }
}

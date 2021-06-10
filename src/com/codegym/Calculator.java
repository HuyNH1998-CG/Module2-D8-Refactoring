package com.codegym;

public class Calculator {
final static char ADDITION = '+';
final static char SUBTRACT = '-';
final static char MULTIPLY = '*';
final static char DIVISION = '/';
    public static int calculate(int a, int b, char o) {
        switch (o) {
            case ADDITION:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVISION:
                if (b != 0)
                    return a / b;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}

package com.example.Calculator_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Lớp Calculator được sửa đổi để hỗ trợ số thập phân
    static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return (double) a / b;
        }
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(1, calculator.subtract(-1, -2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(2, calculator.multiply(-1, -2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
        assertEquals(-2, calculator.divide(-4, 2));
        assertEquals(2, calculator.divide(-4, -2));

        // Test ngoại lệ khi chia cho 0
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3));
        assertEquals(1, calculator.add(-2, 3));
    }

    @Test
    public void testSubtractionWithLargeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(999999, calculator.subtract(1000000, 1));
        assertEquals(-999999, calculator.subtract(-1000000, -1));
    }

    @Test
    public void testMultiplicationWithDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(6.25, calculator.multiply(2.5, 2.5), 0.0001);
    }

    @Test
    public void testAdditionWithDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(5.5, calculator.add(2.5, 3.0), 0.0001);
        assertEquals(-0.5, calculator.add(-2.5, 2.0), 0.0001);
    }
}

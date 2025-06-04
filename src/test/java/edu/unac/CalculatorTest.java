package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition(){
        Calculator calc = new Calculator();
        assertEquals(5,calc.add(2,3));
    }

    @Test
    void testMultiplication(){
        Calculator calc = new Calculator();
        assertEquals(6,calc.multiply(2,3));
    }

    @Test
    void testsubtraction(){
        Calculator calc = new Calculator();
        assertEquals(2,calc.subtract(5,3));
        assertEquals(-1,calc.subtract(2,3));
        assertEquals(0,calc.subtract(7,7));
    }

}
package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }
    @Test
    public void divideSuccess(){
        assertEquals(10, calculator.devide(100,10));
    }

    @Test
    public void divideByZero(){
        Assertions.assertThrows(ArithmeticException.class, ()-> calculator.devide(10,0));
    }

    @Test
    public void testPrint(){
        assertEquals("Hellowww...", calculator.print());
    }
}

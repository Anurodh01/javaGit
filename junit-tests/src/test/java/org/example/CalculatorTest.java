package org.example;

import static junit.framework.Assert.*;
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
        assertEquals(10.0, calculator.devide(100,10));
    }
}

package ru.lesson.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tachkin's on 15.05.2017.
 */
public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void add() throws Exception {
        calc.add(1,1,1);
        assertEquals(3, calc.getResult());
    }

    @Test
    public void sub() throws Exception {
        calc.sub(3,2,1);
        assertEquals(-6, calc.getResult());
    }

    @Test
    public void mult() throws Exception {
        calc.mult(3,3,3);
        assertEquals(27, calc.getResult());
    }

    @Test
    public void div() throws Exception {
        calc.div(9,3,3);
        assertEquals(1, calc.getResult());
    }

    @Test
    public void pow() throws Exception {
        calc.pow(3,2);
        assertEquals(9, calc.getResult());
    }

    @Test
    public void cleanResult() throws Exception {
        calc.add(1,1,1);
        calc.cleanResult();
        assertEquals(0, calc.getResult());
    }

}
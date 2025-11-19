package at.aau.serg.exercises.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {
    private MyMath myMath;

    // a setup method to initialize MyMath instance before each test
    @BeforeEach
    void setUp() {
        myMath = new MyMath();
    }

    // each method now gets has a name describing what it tests
    @Test
    void addTest() {
        // only one assertion per test method
        double result = myMath.add(10d, 5d);
        assertEquals(15.0, result, 1e-6);
    }

    @Test
    void subTest() {
        double result = myMath.sub(10d, 5d);
        assertEquals(5.0, result, 1e-6);
    }

    @Test
    void mulTest() {
        double result = myMath.mul(10d, 5d);
        assertEquals(50.0, result, 1e-6);
    }

    @Test
    void mulTest() {
        double result = myMath.div(10d, 5d);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    void reduceTenOverSixToFiveOverThreeTest() {
        Fraction f = new Fraction(10, 6);
        Fraction reduced = myMath.reduce(f);
        assertEquals(5, reduced.getNumerator().intValue());
        assertEquals(3, reduced.getDenumerator().intValue());
    }

    @Test
    void toDoubleTest() {
        Fraction f = new Fraction(10, 5);
        double result = myMath.toDouble(f);
        assertEquals(2.0, result, 1e-6);
    }
}

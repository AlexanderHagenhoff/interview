package de.interview.magic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscCalcTest {

    private final DiscCalc discountCalculator = new DiscCalc();

    @Test
    void shouldApplyDiscountType1() {
        double result = discountCalculator.calculate(100.0, 1);

        assertEquals(90.0, result);
    }

    @Test
    void shouldApplyDiscountType2() {
        double result = discountCalculator.calculate(100.0, 2);

        assertEquals(80.0, result);
    }

    @Test
    void shouldApplyDiscountType3() {
        double result = discountCalculator.calculate(100.0, 3);

        assertEquals(95.0, result);
    }

    @Test
    void shouldReturnOriginalPriceForUnknownType() {
        double result = discountCalculator.calculate(100.0, 99);

        assertEquals(100.0, result);
    }

    @Test
    void shouldHandleZeroPrice() {
        double result = discountCalculator.calculate(0.0, 1);

        assertEquals(0.0, result);
    }

    @Test
    void shouldHandleNegativePrice() {
        double result = discountCalculator.calculate(-100.0, 1);

        assertEquals(-90.0, result);
    }

    @Test
    void shouldHandleBoundaryFloatingPoint() {
        double result = discountCalculator.calculate(0.1, 1);

        assertEquals(0.09, result, 0.000001);
    }
}

package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class DiscountCalculator {

    private static final double THREE_PERCENT = 0.03d;
    private static final double TWO_PERCENT = 0.02d;
    private static final double ONE_PERCENT = 0.01d;
    private static final double NO_DISCOUNT = 0.0d;

    public static double calculateDiscount(double value) {
        if (value >= 5000) {
            return THREE_PERCENT;
        }
        if (value >= 2000) {
            return TWO_PERCENT;
        }
        if (value >= 1000) {
            return ONE_PERCENT;
        }
        return NO_DISCOUNT;
    }
}

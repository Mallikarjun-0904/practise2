
package com.guru.exam;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class isoscelesTest {

    isosceles obj = new isosceles();

    @Test
    public void testIsosceles() {
        assertTrue(obj.checkTriangle(5, 5, 3));
    }

    @Test
    public void testNotIsosceles() {
        assertFalse(obj.checkTriangle(3, 4, 5));
    }

    @Test
    public void testEquilateral() {
        assertTrue(obj.checkTriangle(5, 5, 5));
    }

    @Test
    public void testInvalidTriangle() {
        assertFalse(obj.checkTriangle(1, 2, 5));
    }

    @Test
    public void testZeroSide() {
        assertFalse(obj.checkTriangle(0, 5, 5));
    }
}

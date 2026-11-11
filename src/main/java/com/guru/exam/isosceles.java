
package com.guru.exam;

public class isosceles {

    public boolean checkTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }

        return (a == b || b == c || a == c);
    }

    public static void main(String[] args) {

        isosceles obj = new isosceles();

        System.out.println(obj.checkTriangle(5, 5, 3));
    }
}

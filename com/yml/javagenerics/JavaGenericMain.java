package com.yml.javagenerics;

public class JavaGenericMain {
    public static void main(String args[]) {
        Integer a1 = 20, b1 = 3, c1 = 7;
        Integer x1 = 5, y1 = 10, z1 = 2;
        Integer p1 = 2, q1 = 9, r1 = 15;

        Float a2 = 20f, b2 = 3f, c2 = 7f;
        Float x2 = 5f, y2 = 10f, z2 = 2f;
        Float p2 = 2f, q2 = 9f, r2 = 15f;

        String x3 = "peach", y3 = "banana:", z3 = "apple";
		String a3 = "apple", b3 = "peach", c3 = "banana";
        String p3 = "banana", q3 = "apple", r3 = "peach";
        
        new Maximum<Integer>(a1, b1, c1).testMaximum();
        new Maximum<Integer>(x1, y1, z1).testMaximum();
        new Maximum<Integer>(p1, q1, r1).testMaximum();

        new Maximum<Float>(a2, b2, c2).testMaximum();
        new Maximum<Float>(x2, y2, z2).testMaximum();
        new Maximum<Float>(p2, q2, r2).testMaximum();

        new Maximum<String>(x3, y3, z3).testMaximum();
        new Maximum<String>(a3, b3, c3).testMaximum();
        new Maximum<String>(p3, q3, r3).testMaximum();

    }
}

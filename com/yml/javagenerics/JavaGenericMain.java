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
        
        Maximum.maximum(a1, b1, c1);
        Maximum.maximum(x1, y1, z1);
        Maximum.maximum(p1, q1, r1);

        Maximum.maximum(a2, b2, c2);
        Maximum.maximum(x2, y2, z2);
        Maximum.maximum(p2, q2, r2);

        Maximum.maximum(x3, y3, z3);
        Maximum.maximum(a3, b3, c3);
        Maximum.maximum(p3, q3, r3);

    }
}

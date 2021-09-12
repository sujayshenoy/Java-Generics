package com.yml.javagenerics;

public class JavaGenericMain {
    public static void main(String args[]) {
        Integer a1 = 20, b1 = 3, c1 = 7, d1 = 9;
        Float a2 = 22f, b2 = 31f, c2 = 17f, d2 = 34f;
        String a3 = "banana", b3 = "apple", c3 = "peach", d3 = "mango";
        
        new Maximum<Integer>().testMaximum(a1,b1,c1,d1);
        new Maximum<Float>().testMaximum(a2,b2,c2,d2);
        new Maximum<String>().testMaximum(a3,b3,c3,d3);

    }
}

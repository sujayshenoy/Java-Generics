package com.yml.javagenerics;

public class Maximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println(max+" is the maximum");
        return max;
    }
    
}

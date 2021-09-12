package com.yml.javagenerics;

public class Maximum<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public T testMaximum(){
        return maximum(x,y,z);
    }

    private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println(max+" is the maximum");
        return max;
    }
    
}

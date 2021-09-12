package com.yml.javagenerics;

public class Maximum {
    public static Integer maximum(Integer x, Integer y, Integer z) {
        Integer max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println(max+" is the maximum integer");
        return max;
    }
    
}

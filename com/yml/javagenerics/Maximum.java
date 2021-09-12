package com.yml.javagenerics;

public class Maximum {
    public static Integer maximumInteger(Integer x, Integer y, Integer z) {
        Integer max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println(max+" is the maximum integer");
        return max;
    }
    
    public static Float maximumFloat(Float x, Float y, Float z) {
        Float max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println(max+" is the maximum Float");
        return max;
    }
}

package com.yml.javagenerics;

public class JavaGenericMain {
    public static void main(String args[]) {
        String x = "peach", y = "banana:", z = "apple";
		String a = "apple", b = "peach", c = "banana";
        String p = "banana", q = "apple", r = "peach";
        
        Maximum.maximumString(x, y, z);
        Maximum.maximumString(a, b, c);
        Maximum.maximumString(p, q, r);

    }
}

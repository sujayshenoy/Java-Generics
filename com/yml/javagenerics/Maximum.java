package com.yml.javagenerics;

import java.util.*;
import java.io.*;


public class Maximum<T extends Comparable<T>> {
    List<T> list = new ArrayList<T>();
    
    public T testMaximum(T... t) {
        for(T i: t) {
			list.add(i);
		}
        return maximum(list);
    }

    private static <T extends Comparable<T>> T maximum(List<T> params) {
		PrintWriter out = new PrintWriter(System.out, true);
        
		int n = params.size();

		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (params.get(j).compareTo(params.get(j + 1)) > 0) {
					T temp = params.get(j);
					params.set(j, params.get(j + 1));
					params.set(j + 1, temp);
				}
			}
		}
		
		T max = params.get(n-1);
		out.println(" Maximum : "+max);
		return max;
    }
    
}

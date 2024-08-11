package com.sultaale.patterns.adapter;

import java.util.*;

public class IteratorApp {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,2,4,6,7,9);
        Iterator<Integer> it = list.iterator();

        Enumeration<Object> en = new IteratorAdapter(it);

        while (en.hasMoreElements()) {
            System.out.print(en.nextElement());
        }
    }
}

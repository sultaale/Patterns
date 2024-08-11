package com.sultaale.patterns.templateMethod.v3;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList{
    private String[] myList;
    MyStringList(String[] strings) {
        myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] duсks = {"Mallard Duck", "Readhead Duck","Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(duсks);
        List ducksSubList = ducksList.subList(2,3);
        ducksSubList.forEach(System.out::print);
    }
}

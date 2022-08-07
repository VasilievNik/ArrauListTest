package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(IntegerList.add(1));
        System.out.println(IntegerList.add(2,2));
        System.out.println(IntegerList.set(1,3));
        IntegerList.remove(2);
        System.out.println(IntegerList.contains(2));
        System.out.println(IntegerList.indexOf(2));
        System.out.println(IntegerList.lastIndexOf(3));
        System.out.println(IntegerList.get(2));
        System.out.println(IntegerList.size());
        System.out.println(IntegerList.isEmpty());
        System.out.println(IntegerList.toArray());
        IntegerList.clear();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(StringList.add("a"));
        System.out.println(StringList.add(2,"b"));
        System.out.println(StringList.set(1,"c"));
        System.out.println(StringList.remove("c"));
        StringList.remove(2);
        System.out.println(StringList.contains("b"));
        System.out.println(StringList.indexOf("b"));
        System.out.println(StringList.lastIndexOf("b"));
        System.out.println(StringList.get(2));
        System.out.println(StringList.size());
        System.out.println(StringList.isEmpty());
        System.out.println(StringList.toArray());
        StringList.clear();
    }
}

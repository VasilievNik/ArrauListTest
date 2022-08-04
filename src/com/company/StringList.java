package com.company;

import java.util.ArrayList;
import java.util.Objects;

public interface StringList {

    ArrayList<String> arrayList = new ArrayList<String>();

    static String add(String item){
        arrayList.add(item);
        return(item);
    }

    static String add(int index, String item){
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        arrayList.set(index, item);
        return item;
    }

    static String set(int index, String item){
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        arrayList.set(index, item);
        return item;
    }

    static String remove(String item){
        for (int i = 0; i<=arrayList.size(); i++){
            if (Objects.equals(arrayList.get(i), item)){
                arrayList.remove(item);
                return item;
            }
        }
        throw new IllegalArgumentException();
    }

    static void remove(int index){
            if(index>arrayList.size()){
                throw new ArrayIndexOutOfBoundsException();
            }
            arrayList.remove(index);
    }

    static boolean contains(String item){
        for (int i = 0; i<=arrayList.size(); i++){
            if (Objects.equals(arrayList.get(i), item)){
                return true;
            }
        }
        return false;
    }

    static int indexOf(String item){
        for (int i = 0; i<=arrayList.size(); i++){
            if (Objects.equals(arrayList.get(i), item)){
                return Integer.parseInt(arrayList.get(i));
            }
        }
        return -1;
    }


    static int lastIndexOf(String item){
        for (int i = arrayList.size(); i>=0; i--){
            if (Objects.equals(arrayList.get(i), item)){
                return Integer.parseInt(arrayList.get(i));
            }
        }
        return -1;
    }

    static String get(int index){
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayList.get(index);
    }

    static boolean equals(StringList otherList){
        return arrayList.equals(otherList);
    }

    static int size(){
        return arrayList.size();
    }

    static boolean isEmpty(){
        return arrayList.isEmpty();
    }

    static void clear(){
        arrayList.clear();
    }

    static ArrayList<String> toArray(){
        ArrayList<String> arrayList1 = new ArrayList<String>();
        for (int i = 0; i<=arrayList.size(); i++){
          arrayList1.set(i, arrayList.get(i));
        }
        return arrayList1;
    }
}

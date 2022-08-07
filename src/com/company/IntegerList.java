package com.company;

import java.util.ArrayList;
import java.util.Objects;

public interface IntegerList {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    static Integer add(Integer item){
        arrayList.add(item);
        return(item);
    }

    static Integer add(int index, Integer item){ //Зачем сортировать, если можно просивоить индексу значение. Самый быстрый меод
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        arrayList.set(item, item);
        return item;
    }

    static Integer set(int index, Integer item){
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        arrayList.set(item, item);
        return item;
    }

    static void remove(int index){
            if(index>arrayList.size()){
                throw new ArrayIndexOutOfBoundsException();
            }
            arrayList.remove(index);
    }

    static boolean contains(Integer item){
        if (arrayList.get(item) != 0 ){
            return true;
        }
        return false;
    }

    static int indexOf(Integer item){
        if (arrayList.get(item) != 0 ){
            return arrayList.get(item);
        }
        return -1;
    }


    static int lastIndexOf(Integer item){
        if (arrayList.get(item) != 0 ){
            return arrayList.get(item);
        }
        return -1;
    }

    static Integer get(int index){
        if(index>arrayList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayList.get(index);
    }

    static boolean equals(IntegerList otherList){
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

    static ArrayList<Integer> toArray(){
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for (int i = 0; i<=arrayList.size(); i++){
          arrayList1.set(i, arrayList.get(i));
        }
        return arrayList1;
    }
}

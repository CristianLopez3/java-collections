package org.cristian.list;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList {

    /**
     * LinkedList have the same methods that ArrayList
     */
    private static LinkedList multipleTypeOfObjects = new LinkedList();
    private static LinkedList<Integer> oneDataType = new LinkedList<>();

    public static void main(String[] args){
        addElements();
        linkedListSpecialMethods();
        System.out.println(oneDataType);
    }

    static void methods(){
        oneDataType.add(5);
        oneDataType.add(3, 4);
        oneDataType.remove(4);
        oneDataType.removeAll(oneDataType);
        oneDataType.get(1);
        oneDataType.set(1, 20);
    }

    static void collectionsMethods(){
        Collections.sort(oneDataType);
        Collections.shuffle(oneDataType);
    }

    static void linkedListSpecialMethods(){
         oneDataType.addFirst(0);
         oneDataType.addLast(4);
         oneDataType.removeFirst();
         oneDataType.removeLast();
         oneDataType.getFirst();
         oneDataType.getLast();
    }

    static void addElements(){
        oneDataType.add(1);
        oneDataType.add(2);
        oneDataType.add(3);
    }


}

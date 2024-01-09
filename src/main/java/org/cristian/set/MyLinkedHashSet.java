package org.cristian.set;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {

    public static void main(String args[]){
        LinkedHashSet<Integer> hashWithOneDataType = new LinkedHashSet<>();
        LinkedHashSet hashGeneric = new LinkedHashSet();

        LinkedHashSet ex = new LinkedHashSet();
        ex.add(100);
        ex.add(200);
        ex.add(300);
        System.out.println(ex);
        // The rest methods are the same.
    }

}

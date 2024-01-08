package org.cristian.set;

import java.util.HashSet;

public class MyHashSet {

    HashSet hashSetWithDifferentTypeData = new HashSet();
    HashSet hashSetWithSize = new HashSet(100); //load factor is 0.75\
    HashSet hashSetWithLoadFactor = new HashSet(100, 0.95F);
    HashSet<Integer> hashSetWithDataType = new HashSet<Integer>();

    static HashSet<Integer> hashSet = new HashSet<Integer>();

    public static void main(String[] args){
        // This gives us the common elements between two lists
//        hashSet.retainAll(collection);
    }

    static void methods(){
        hashSet.add(4);
//        hashSet.addAll(2, Collection);
        hashSet.remove(1); // param = value not an index.
//        hashSet.removeAll( Collection);
        hashSet.isEmpty();
        hashSet.contains(1);
    }

}

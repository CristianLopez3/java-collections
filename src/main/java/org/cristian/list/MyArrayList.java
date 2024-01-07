package org.cristian.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyArrayList {

    /**
     * Different ways to declare ArrayList objects.
     */
    static ArrayList arrayListForDifferentObjects = new ArrayList();
    static ArrayList<String> arrayListForOneElement = new ArrayList<String>(); // Must be a wrapper class
    static ArrayList<Integer> example = new ArrayList<>();

    public static void main(String[] args) {

        arrayListMethods();
        collectionsClass();
        readData();
        removeAndAddAll();

    }

    static void arrayListMethods(){
        example.add(1);
        example.add(2, 100);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        example.addAll(2, arrayList);;
        example.size();
        example.set(0, 10); // set method for every element in our Array List
        example.get(0); // get the value of the giving index for every element in our Array List
        example.contains(10);
        example.isEmpty();
        example.remove(1);
        example.removeAll(arrayList);
        example.retainAll(arrayList);
    }

    static void readData(){
        addElementsToExample();
        System.out.println("With for: ");
        for(int i = 0; i < example.size(); i++){
            System.out.println(example.get(i));
        }
        System.out.println("With for of: ");
        for(Integer element: example){
            System.out.println(element);
        }
        System.out.println("With forEach and lambdas");
        example.forEach(element -> System.out.println(element));
        System.out.println("More simplified forEach");
        example.forEach(System.out::println);

    }

    static void collectionsClass(){
        addElementsToExample();
        example.add(1, 18);
        System.out.println(example);

        Collections.shuffle(example); // barajar
        System.out.println("After shuffling: " + example);

        Collections.sort(example);
        System.out.println("After sorting: " + example);

        // Sort in reverse way
        Collections.sort(example, Collections.reverseOrder());

    }

    static void removeAndAddAll(){
        addElementsToExample();
        System.out.println("Array: " + example);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        // add all
        example.addAll(2, arrayList);
        System.out.println("After adding all: " + example);
        // remove all
        example.removeAll(arrayList);
        System.out.println("After removing all: " + example);


    }

    static void arrayToArrayList(){
        String arr[] = {"Dog", "Cat", "Bunny"};
        for(String element: arr){
            System.out.println(element);
        }

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array List: " + arrayList);
    }

    static void addElementsToExample(){
        example.add(1);
        example.add(2);
        example.add(5);
        example.add(6);
    }

}

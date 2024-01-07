# Java Collections Framework

In this repository you can see my work with java collections framework to master java.

> [!TIP]
> Collections are a group of objects.

Collections Framework: provide classes and interfaces to management collections.

## Array

Arrays have the next problems;
1. Fixed.
2. Growable in nature.
3. Homogenous Data.
4. Data Structure (login or methods).

* array: only need the same type of data (object).
* object array: We can represent different type of data in object array.
    - Object a[] = new Object[5];

## Collections Framework

1. ArrayList
2. List
3. HashMap
4. ListTab
5. LinkedList

Characteristics of collections:
* Growable in nature.
* Hold homogenous data and heterogeneous.
* Have methods to manipulate its data.

##### Collection Interface

It's one of the most important parts of collection framework due to it provide a bunch of methods to manipulate 
collections data.
* List(Interface)
    - List is a child of collection.
    - Duplicates are allowed.
    - Insert order preserved its order, it mean that the last insert is the last index.
    -  *classes:*
        - ArrayList
        - LinkedList
        - Vector <- Stack <Legacy Classes>
    
* Set(Interface)
    - Set is a child of collection.
    - Insertion order is not preserved
    - Duplicates not allowed
    - *classes:*
        - HashSet
        - LinkedHashSet
        - Vector <- Stack <Legacy Classes>
* Queue(interface)
    - Queue is a child of collection.
    - FIFO - First in First out
    - Focus in prior processing
    - *classes:*
        - PriorityQueue

* <b>Map(interface)</b>
    - Map isn't a child of collection
    - Map hava key and value.
      - keys are unique.
    - *classes:*
      - HashMap
      - LinkHashMap                   

### Collections class
A class for java.utils package contains methods to perform methods through java Collections, such as:
* Collections.sort(ArrayList);



### Collection Methods
Methods for every interface extends for Collection:
* add(object)
* addAll(collection objects)
* remove(object)
* removeAll(collection)
* retainAll(collection) -> except the passed object removed the rest\
* clear()
* isEmpty()
* size()
* contains(object) 
* containsAll(collection objects)
* toArray(collection)
* get(index) -> available for linked collections
* set(index) -> change the value of the element in the index giving

> [!IMPORTANT]
> If you want to sort a list, all of its elements must be the same type
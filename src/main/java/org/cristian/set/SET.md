# Set

Set interface have two classes, such as:
* HashSet
* LinkedHashSet

## HashSet

You must use HashSet when you have random elements and don't need 
duplicates.

<b> Characteristics:  </b>

* Does not allow duplicate items: It is based on the hash table data structure, which means that it cannot contain duplicate items. If you try to add an item that is already present, it will not be added again.
* Does not guarantee a specific order: Elements are not stored in a specific order, insertion order is not guaranteed or maintained.
* Allows null elements: Can contain a single null element as it does not allow duplicates. When trying to add a second null value, it will not be added.
* Efficient operations: Provides a constant (approximately constant) lookup time, which means that operations such as add, remove and contains have constant performance, regardless of the set size.
* Implements the Set interface: HashSet implements the Set interface, which means that it inherits all the features of a set, such as the ability to check for the presence of elements, add and remove elements, among others.
* It is not synchronous: It is not safe for concurrent operations by default. If you require security in multi-threaded environments, you should use Collections.synchronizedSet(new HashSet<>()) or use Collections.newSetFromMap(new ConcurrentHashMap<>()) to obtain a thread-safe set.
* The main use of a HashSet is when you need to store a collection of unique elements without worrying about the order in which they are stored.


The size for the default it's going to be 16.

### Load Factor
The load factor in a HashSet (and other hash table based structures) is a factor that 
determines when the underlying hash table will be automatically resized to maintain good performance.

In the context of HashSet:
Load Factor: The fraction of the total hash table size that is allowed to fill before the table is
automatically resized.

Default value: The default value of the load factor in a HashSet is 0.75.
When the number of elements in the HashSet reaches a certain percentage of the total size
(determined by the load factor), the hash table is automatically resized to maintain performance. 
This means that the hash table is reorganised internally to distribute the elements more evenly, 
which helps to avoid excessive collisions and to maintain a constant lookup time.

A higher load factor means that the HashSet will be filled more before it is resized, 
which saves memory but may reduce performance due to a higher probability of collisions.
A lower load factor means more frequent resizing, which may consume more memory, 
but reduces the probability of collisions and maintains better performance.



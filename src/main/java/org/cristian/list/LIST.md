

## ArrayList
Choose ArrayList when you have th e need to use index to retriving the 
content.

* Array list have and order.
* Array list has by default a size of ten elements.
* Array list is growable.
* Allows duplicates.

```java
import java.util.ArrayList;

ArrayList arrayList = new ArrayList();
ArrayList<Integer> arrayList = new ArrayList<Integer>();
```

## LinkedList
Choose LinkedList when you need use insertion/deletion operations because
linked list work with nodes that allow more perform.

LinkedList also implement DQueue methods and it's more natural as stack concept,
this because it's "FILO" (first in last out).

> Queue: Follows the FIFO concept, that meaning "FIRST IN FIRST OUT"
> Stack: Follows the FILO concept, that meaning "FIRST IN LAST OUT"



## points to remember:

- Maintains **insertion order**
- Allows **duplicates**
- Provides **random access** (O(1) time complexity)
- ArrayList inherits AbstractList class and implements the List interface.
- ArrayList is initialized by size. However, the size is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
- Java ArrayList allows us to randomly access the list.
- ArrayList can not be used for **primitive types**, like int, char, etc. We need a wrapper class for such cases.
- ArrayList in Java can be seen as a vector in C++.
- ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.

## types:

- **AbstractList**: This class is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.
- **CopyOnWriteArrayList**: This class implements the list interface. It is an enhanced version of ArrayList in which all the modifications(add, set, remove, etc.) are implemented by making a fresh copy of the list.
- **AbstractSequentialList**: This class extends AbstractList. This class is used to provide the skeletal implementation for lists that are accessed sequiencially (i.e iterators) to create a concrete class. It can implement the get(int index) and size() methods.

## Declaration

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
ArrayList<Integer> nums = new ArrayList<>(20);
```

---

## Common Methods

### Add & Remove

```java
list.add("Apple");
list.add(1, "Banana");
list.addAll(otherList);
list.remove(0);
list.remove("Apple");
list.clear();
list.retainAll(retainList);
list.removeAll(removeList);
```

---

### Access & Search

```java
String item = list.get(0);
list.set(1, "Mango");
int index = list.indexOf("Banana");
int lastIndex = list.lastIndexOf("Banana");
boolean hasItem = list.contains("Apple");
boolean empty = list.isEmpty();
int size = list.size();
```

---

### Iteration

```java
for (String fruit : list) {
    System.out.println(fruit);
}

list.forEach(System.out::println);

Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

### Conversion & Utility

```java
Object[] arr = list.toArray();
String[] strArr = list.toArray(new String[0]);
ArrayList<String> clone = (ArrayList<String>) list.clone();
list.ensureCapacity(100);
list.trimToSize();
```

---

## Sample Usage

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.remove("Banana");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

---

## Notes

- Not thread-safe: wrap using `Collections.synchronizedList()`.
- Use `LinkedList` if frequent insertions/deletions are needed in the middle.
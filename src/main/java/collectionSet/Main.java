package collectionSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Java': " + hashSet.contains("Java"));

        // SortedSet Example
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Orange");

        System.out.println("\nSortedSet: " + sortedSet);
        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());
        System.out.println("Subset [Banana, Orange]: " + sortedSet.subSet("Apple", "Orange"));

        // TreeSet Example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);

        System.out.println("\nTreeSet: " + treeSet);
        System.out.println("Ceiling for 4: " + treeSet.ceiling(4));
        System.out.println("Floor for 6: " + treeSet.floor(6));
        System.out.println("Higher than 3: " + treeSet.higher(3));

    }
}
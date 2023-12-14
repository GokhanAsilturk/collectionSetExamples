package collectionSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Book> bookHashSet = new HashSet<>();

        bookHashSet.add(new Book("Java Programming", "Ali", 2019));
        bookHashSet.add(new Book("Python Essentials", "Veli", 2020));
        bookHashSet.add(new Book("C++ for Beginners", "Gökhan", 2018));

        // HashSet Methods
        System.out.println("\nHashSet Methods:");
        System.out.println("\nContains 'Java Programming': " + bookHashSet.contains(new Book("Java Programming", "Ali", 2019)));
        System.out.println("\nSize of HashSet: " + bookHashSet.size());
        System.out.println("\nIs HashSet empty? " + bookHashSet.isEmpty());

    }}

package collectionSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Book> bookSortedSet = new TreeSet<>();

        bookSortedSet.add(new Book("Java Programming", "Ali", 2019));
        bookSortedSet.add(new Book("Python Essentials", "Veli", 2020));
        bookSortedSet.add(new Book("C++ for Beginners", "Gökhan", 2018));

        //SortedSet Mehtods
        System.out.println("\nSortedSet of Books: " + bookSortedSet);
        System.out.println("\nFirst Book: " + bookSortedSet.first());
        System.out.println("\nLast Book: " + bookSortedSet.last());

        //Subset Method
        System.out.println("\nSortedSet Methods:");
        SortedSet<Book> subSet = bookSortedSet.subSet(
                new Book("C++ for Beginners", "Gökhan", 2018),
                new Book("Python Essentials", "Veli", 2020)
        );
        System.out.println("Subset: " + subSet);
        System.out.println("Head Set (Before Java Programming): " + bookSortedSet.headSet(new Book("Java Programming", "Ali", 2019)));
        System.out.println("Tail Set (After Java Programming): " + bookSortedSet.tailSet(new Book("Java Programming", "Ali", 2019)));
    }
}

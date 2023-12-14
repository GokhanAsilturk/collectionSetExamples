package collectionSet;


import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(new Book("Java Programming", "Ali", 2019));
        bookTreeSet.add(new Book("Python Essentials", "Veli", 2020));
        bookTreeSet.add(new Book("C++ for Beginners", "Gökhan", 2018));

        System.out.println("\nOriginal TreeSet of Books: " + bookTreeSet);

        //lower() method
        Book lowerBook = bookTreeSet.lower(new Book("Java Programming", "Ali", 2019));
        System.out.println("\nBook before Java Programming: " + lowerBook);

        //higher() method
        Book higherBook = bookTreeSet.higher(new Book("Java Programming", "Ali", 2019));
        System.out.println("\nBook after Java Programming: " + higherBook);

        //pollFirst() method
        Book firstBook = bookTreeSet.pollFirst();
        System.out.println("\nRemoved first book: " + firstBook);
        System.out.println("\nRemaining TreeSet of Books: " + bookTreeSet);

    }

}

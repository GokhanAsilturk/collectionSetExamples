package collectionSet;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Book> linkedSetBook = new LinkedHashSet<>();

        linkedSetBook.add(new Book("Java Programming", "Ali", 2019));
        linkedSetBook.add(new Book("Python Essentials", "Veli", 2020));
        linkedSetBook.add(new Book("C++ for Beginners", "Gökhan", 2018));
        //Book book = new Book("C++ for Beginners", "Gökhan", 2018);
        System.out.println(linkedSetBook);

        System.out.println(linkedSetBook);
        //List<Object> bookList = linkedSetBook.stream().map(book -> book.setTitle("aa")).toList();
        List<Book> updatedBooks = linkedSetBook.stream()
                .map(book -> {
                    book.setTitle("asd");
                    return book;
                }).toList();
        System.out.println(updatedBooks);
    }



}

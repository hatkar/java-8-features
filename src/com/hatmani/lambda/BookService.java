package com.hatmani.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
public  List<Book> getBooksinSort() {

    List<Book> books = new BookDAO().getBooks();
    //Methode 1
    Collections.sort(books,new MyComparator());
    //Methode 2 @FunctionalInterface
    Collections.sort(books, new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o2.getName().compareTo(o1.getName());
        }
    });
    //Methode 3 Anonymous Implementation
    Collections.sort(books,(o1,o2)->o2.getName().compareTo(o1.getName()));
return  books;
}

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}
class MyComparator implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
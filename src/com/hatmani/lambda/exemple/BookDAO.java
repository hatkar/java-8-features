package com.hatmani.lambda.exemple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookDAO {

public List<Book> getBooks(){
    List<Book>books = new ArrayList<>();
    books.add(new Book(101,"Core java",500));
    books.add(new Book(102,"Hibernate",200));
    books.add(new Book(103,"Spring Boot",500));
    books.add(new Book(104,"Web Services",500));
    return  books;
}
    public Map<Book,Integer> getMapBooks(){
        Map<Book,Integer> books = new TreeMap<>((o1,o2)->(int)(o2.getPage()+o1.getPage()));
        books.put(new Book(101,"Core java",500),60);
        books.put(new Book(102,"Hibernate",200),100);
        books.put(new Book(103,"Spring Boot",500),25);
        books.put(new Book(104,"Web Services",500),30);
        return  books;
    }
}

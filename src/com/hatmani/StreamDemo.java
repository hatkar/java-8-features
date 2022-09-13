package com.hatmani;

import com.hatmani.lambda.Book;
import com.hatmani.lambda.BookDAO;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StreamDemo {
    public static void main(String[] args) {
        BookDAO database = new BookDAO();
        List<Book> books = database.getBooks();
        books.stream().sorted(Comparator.comparing(bo->bo.getPage())).forEach(System.out::println);
        books.stream().sorted(Comparator.comparing(Book::getName).reversed()).forEach(System.out::println);
        System.out.println("********MAP*******");
        Map<Book,Integer> bookMap = database.getMapBooks();
        System.out.println(bookMap);
        bookMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getName)))
                .forEach(System.out::println);

    }


}

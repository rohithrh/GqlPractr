package com.example.GqlPractr.model;

import java.util.Arrays;
import java.util.List;

public record Book(String id, String name, int pageCount,
                   String authorId) {
    private static List<Book> books = Arrays.asList(
            new Book("b-1","Harry potter",500,"a-1"),
            new Book("b-2","Alchemist",200,"a-2"),
            new Book("b-3","Data structures",420,"a-3")
    );
    public static Book findbyId(String id){
        for (Book b : books) {
            if (b.id.equals(id)) {
                return b;
            }
        }
        return null;
    }
}

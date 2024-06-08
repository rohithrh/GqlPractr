package com.example.GqlPractr.model;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static List<Author> authors= Arrays.asList(
            new Author("a-1","f1","l1"),
            new Author("a-2","f2","l2"),
            new Author("a-3","f3","l3")
    );
    public static Author findById(String id){
        for (Author a : authors) {
            if (a.id.equals(id)) {
                return a;
            }
        }
        return null;
    }

}

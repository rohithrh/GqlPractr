package com.example.GqlPractr.controller;

import com.example.GqlPractr.model.Author;
import com.example.GqlPractr.model.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphController {
    @QueryMapping
    public Book bookById(@Argument String id){
        return Book.findbyId(id);
    }
//    spring.graphql.graphiql.enabled=true
    @SchemaMapping
    public Author author(Book book){
        return Author.findById(book.authorId());
    }

}

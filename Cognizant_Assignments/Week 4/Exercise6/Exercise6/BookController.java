package com.bookstore.controller;

import com.bookstore.exception.BookNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable("id") int id) {
        if (id <= 0) {
            throw new BookNotFoundException("Book not found with ID: " + id);
        }
        return "Book details for ID: " + id;
    }
}

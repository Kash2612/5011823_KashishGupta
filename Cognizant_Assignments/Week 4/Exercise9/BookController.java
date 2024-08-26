package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.model.BookModel;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookModel> createBook(@Valid @RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        BookModel bookModel = convertToModel(savedBook);
        return ResponseEntity.ok(bookModel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookModel> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id)
                .map(book -> ResponseEntity.ok(convertToModel(book)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<BookModel>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        List<BookModel> bookModels = books.stream()
                .map(this::convertToModel)
                .toList();
        return ResponseEntity.ok(bookModels);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookModel> updateBook(@PathVariable Long id, @Valid @RequestBody Book bookDetails) {
        return bookService.getBookById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPrice(bookDetails.getPrice());
            Book updatedBook = bookService.saveBook(book);
            BookModel bookModel = convertToModel(updatedBook);
            return ResponseEntity.ok(bookModel);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        return bookService.getBookById(id).map(book -> {
            bookService.deleteBook(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }

    private BookModel convertToModel(Book book) {
        BookModel bookModel = new BookModel();
        bookModel.setId(book.getId());
        bookModel.setTitle(book.getTitle());
        bookModel.setAuthor(book.getAuthor());
        bookModel.setPrice(book.getPrice());

        Link selfLink = WebMvcLinkBuilder.linkTo(BookController.class).slash(book.getId()).withSelfRel();
        bookModel.add(selfLink);

        return bookModel;
    }
}

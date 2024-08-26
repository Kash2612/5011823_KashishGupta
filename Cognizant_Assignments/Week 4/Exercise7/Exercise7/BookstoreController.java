package com.bookstore.controller;

import com.bookstore.dto.BookDTO;
import com.bookstore.dto.CustomerDTO;
import com.bookstore.entity.Book;
import com.bookstore.entity.Customer;
import com.bookstore.mapper.BookstoreMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreController {

    private final BookstoreMapper mapper = BookstoreMapper.INSTANCE;

    @PostMapping("/books")
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
        Book book = mapper.bookDTOToBook(bookDTO);
        // Save the book entity to the database (repository code omitted)
        return mapper.bookToBookDTO(book);
    }

    @GetMapping("/books/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        // Retrieve the book entity from the database (repository code omitted)
        Book book = new Book(); // Replace with actual retrieval logic
        return mapper.bookToBookDTO(book);
    }

    @PostMapping("/customers")
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customerDTO) {
        Customer customer = mapper.customerDTOToCustomer(customerDTO);
        // Save the customer entity to the database (repository code omitted)
        return mapper.customerToCustomerDTO(customer);
    }

    @GetMapping("/customers/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        // Retrieve the customer entity from the database (repository code omitted)
        Customer customer = new Customer(); // Replace with actual retrieval logic
        return mapper.customerToCustomerDTO(customer);
    }
}

package com.bookstore.mapper;

import com.bookstore.dto.BookDTO;
import com.bookstore.dto.CustomerDTO;
import com.bookstore.entity.Book;
import com.bookstore.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookstoreMapper {
    BookstoreMapper INSTANCE = Mappers.getMapper(BookstoreMapper.class);

    // Mapping methods
    BookDTO bookToBookDTO(Book book);
    Book bookDTOToBook(BookDTO bookDTO);

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}

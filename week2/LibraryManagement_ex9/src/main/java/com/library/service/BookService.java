package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Method to test the service and repository interaction
    public void printService() {
        System.out.println("BookService is working.");
        bookRepository.printRepository();
    }
}

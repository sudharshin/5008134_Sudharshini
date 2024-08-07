package com.library.librarymanagement.service;

import com.library.librarymanagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for bookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        // Business logic for managing books
        System.out.println("Managing books...");
        bookRepository.fetchBooks();
    }
}

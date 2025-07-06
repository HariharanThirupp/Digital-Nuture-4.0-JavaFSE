package com.example.Service;

import com.example.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("BookService: listing books...");
        bookRepository.getBooks();
    }
}

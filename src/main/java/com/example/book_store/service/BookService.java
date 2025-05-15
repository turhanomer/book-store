package com.example.book_store.service;

import com.example.book_store.model.Book;
import com.example.book_store.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> findByBookId(Integer bookId){
        return bookRepository.findById(BookId);
    }
}

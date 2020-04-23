package com.turanshukur.bookstore.service;

import com.turanshukur.bookstore.model.Book;
import com.turanshukur.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {


    @Autowired
    private BookRepository bookRepository;


    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> allBooks() {
       return bookRepository.findAll();
    }



    public Book getById(Long id) {
        return bookRepository.getOne(id);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

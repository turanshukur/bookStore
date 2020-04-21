package com.turanshukur.bookstore.controller;

import com.turanshukur.bookstore.model.Book;
import com.turanshukur.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("get/all")
    public List<Book> getBooks(){
        return bookService.allBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
       return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
}

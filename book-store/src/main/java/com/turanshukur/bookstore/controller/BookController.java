package com.turanshukur.bookstore.controller;

import com.turanshukur.bookstore.model.Book;
import com.turanshukur.bookstore.repository.BookRepository;
import com.turanshukur.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "book")
public class BookController {

    private byte[] bytes;

    @Autowired
    private BookService bookService;

    @PostMapping("/upload")
    public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        this.bytes = file.getBytes();
        System.out.println("testttt");

    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        book.setPicByte(this.bytes);
        bookService.addBook(book);
        this.bytes = null;
        System.out.println("elave olundu");
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

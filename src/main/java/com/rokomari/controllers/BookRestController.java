package com.rokomari.controllers;

import com.rokomari.entities.Book;
import com.rokomari.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookRestController {
    @Autowired
    private BookService bookService;

    @GetMapping
    @RequestMapping(value = "/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBookById(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long  id){
        bookService.deleteBookById(id);
    }
}

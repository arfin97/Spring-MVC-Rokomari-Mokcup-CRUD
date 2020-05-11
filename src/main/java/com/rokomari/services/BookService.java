package com.rokomari.services;

import com.rokomari.entities.Book;
import com.rokomari.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void saveBook(Book book){
        bookRepository.save(book);
    }

    public Book getBookById(Long id){
       return bookRepository.findById(id).get();
    }

    public Book updateBookById(Long id, Book book){
        Book oldBook = bookRepository.findById(id).get();
        BeanUtils.copyProperties(book, oldBook, "id");
        System.out.println(oldBook);
        return oldBook;
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}

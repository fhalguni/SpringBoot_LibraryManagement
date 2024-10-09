package com.example.springProject.controller;

import com.example.springProject.model.Book;
import com.example.springProject.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BookController {
    static public List<Book> BookList = new ArrayList<>();
    @PostMapping("/createBook")
    public String createBook(@RequestBody Book book) {
        BookList.add(book);
        return "Book created";
    }
    @GetMapping("/getBook")
    public List<Book> getBookList() {
        return BookList;
    }

    @DeleteMapping("/deleteBook")
    public String deleteBook(@RequestBody Book book){
        Book newBook=null;
        boolean exist=false;
        for(Book b:BookList){
            if(b.getAssNo()==book.getAssNo()){
                exist=true;
                newBook=b;
            }
        }
        if(exist){
            BookList.remove(newBook);
            return "Book deleted";
        }else {
            return "Book not found";
        }

    }

    @PatchMapping("/updateBook")
    public List<Book> updateBook(@RequestBody Book book){
        BookList.forEach(s -> {
            if(s.getAssNo() == book.getAssNo()){
                s.setTitle(book.getTitle());
                s.setAuthor(book.getAuthor());
                s.setPrice(book.getPrice());

            }
        });
        return BookList;
    }
}

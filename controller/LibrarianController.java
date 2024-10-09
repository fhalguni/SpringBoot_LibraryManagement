package com.example.springProject.controller;

import com.example.springProject.model.Book;
import com.example.springProject.model.Librarian;
import com.example.springProject.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.springProject.controller.BookController.BookList;
import static com.example.springProject.controller.studentController.studentList;

@RestController
public class LibrarianController {
    List<Librarian> LibrarianList = new ArrayList<>();
    List<String> Library=new ArrayList<>();
    @PostMapping("/createLibrarian")
    public String createLibrarian(@RequestBody Librarian librarian) {
        LibrarianList.add(librarian);
        return "Librarian created";
    }
    @GetMapping("/getLibrarian")
    public List<Librarian> getLibrarian() {
        return LibrarianList;
    }

    @DeleteMapping("/deleteLibrarian")
    public String deleteLibrarian(@RequestBody Librarian librarian) {
        Librarian newLib=null;
        boolean exist=false;
        for(Librarian b:LibrarianList){
            if(b.getId()==librarian.getId()){
                exist=true;
                newLib=b;
            }
        }
        if(exist){
            LibrarianList.remove(newLib);
            return "Librarian deleted";
        }else {
            return "Librarian not found";
        }

    }

    @PatchMapping("/UpdateLibrarian")
    public List<Librarian> UpdateLibrarian(@RequestBody Librarian librarian) {
        LibrarianList.forEach(s -> {
            if(s.getId() == librarian.getId()){
                s.setName(librarian.getName());
                s.setEmail(librarian.getEmail());
                s.setAge(librarian.getAge());

            }
        });
        return LibrarianList;
    }


}


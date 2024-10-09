package com.example.springProject.controller;

import com.example.springProject.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
public class studentController {
     static public List<Student> studentList = new ArrayList<>();
    @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student student) {
        studentList.add(student);
        return "Student created successfully!";
    }

    @GetMapping("/getStudent")
    public List<Student> getStudents() {
        return studentList;
    }


    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestBody Student student){
        Student newStudent=null;
        boolean exist=false;
        for(Student s:studentList) {

            if (s.getPrn() == student.getPrn()) {
                exist = true;
                newStudent = s;
            }
        }
            if (exist) {
                studentList.remove(newStudent);
                return "Student deleted successfully!";
            } else {
                return "Student not deleted!";
            }



    }

    @PatchMapping("/updateStudent")
    public List<Student> updateStudent(@RequestBody Student student){
        studentList.forEach(s -> {
            if(s.getPrn() == student.getPrn()){
                s.setName(student.getName());
                s.setAge(student.getAge());

            }
        });
        return studentList;
    }

}

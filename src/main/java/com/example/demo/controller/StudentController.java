package com.example.Springproject.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springproject.Entity.StudentEntity;
import com.example.Springproject.Service.StudentService;

@RestController
public class StudentController {


    @Autowired
    StudentService ser;

    @PostMapping("/postStudents")
    public StudentEntity addStudents(@RequestBody StudentEntity st){
        return ser.addStudents(st);
    }

    @GetMapping("/getAllStudents")
    public List<StudentEntity> getAllStudents(){
        return ser.getAllStudents();
    }
    @GetMapping("/getStudent/{id}")
    public StudentEntity getStudent(@PathVariable int id){
        return ser.getStudent(id);
    }
    
    @DeleteMapping("/getStudent/{id}")
    public StudentEntity deleteStudent(@PathVariable int id){
        return ser.deleteStudent(id);
    }

}

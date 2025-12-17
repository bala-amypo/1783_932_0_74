package com.example.Springproject.Service;

import org.springframework.stereotype.Service;


import com.example.Springproject.Entity.StudentEntity;
import java.util.*;


@Service
public class StudentService {
    Map<Integer, StudentEntity> details = new HashMap<>();


    public StudentEntity addStudents(StudentEntity st){
        details.put(st.getId(),st);
        return st;
    }

    public List<StudentEntity> getAllStudents() {
        return new ArrayList<>(details.values()) ;
    }

    public StudentEntity getStudent(int id) {
        return details.get(id);
    }

    public StudentEntity deleteStudent(int id) {
        details.remove(id);
        return details.get(id);
    }

    
}   

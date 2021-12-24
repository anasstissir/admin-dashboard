package com.uir.club.admin.controller;

import com.uir.club.admin.model.Student;
import com.uir.club.admin.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserApi {

    private StudentRepository studentRepository;

    @GetMapping
     public Iterable<Student> getStudents(){
         return studentRepository.findAll();
     }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id).get();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}

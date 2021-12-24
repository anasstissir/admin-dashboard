package com.uir.club.admin.controller;

import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Student;
import com.uir.club.admin.repository.ClubRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clubs")
@AllArgsConstructor
public class ClubApi {

    private ClubRepository clubRepository;

    @GetMapping
     public Iterable<Club> getStudents(){
         return clubRepository.findAll();
     }

    @GetMapping(value = "/{id}")
    public Club getStudentById(@PathVariable Long id){
        return clubRepository.findById(id).get();
    }

    @PostMapping
    public Club addStudent(@RequestBody Club club){
        return clubRepository.save(club);
    }
}

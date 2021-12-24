package com.uir.club.admin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String login;
    @JsonIgnore
    private String password;
    private Boolean isAdmin;
    private String firstname;
    private String lastname;
    private String nationaly;
    private String cityOrigin;
    private String branche;
    private String level;
    private String residency;
    private LocalDate dateEnrollment;
    private String tel;
    private String email;

    @ManyToMany(mappedBy = "students")
    Set<Club> clubs;

}

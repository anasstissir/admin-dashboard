package com.uir.club.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Meeting {
    @Id
    private Long id;
    private String title;
    private String responsible;
    private LocalDate timeMeeting;
    private String place;
    private String description;
}

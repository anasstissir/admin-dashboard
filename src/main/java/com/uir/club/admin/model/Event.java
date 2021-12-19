package com.uir.club.admin.model;

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
public class Event {
    @Id
    private Long id;
    private String title;
    private String responsible;
    private LocalDate startDate;
    private LocalDate endDate;
    private String place;
    private String description;
    private Double budget;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Transaction> transactions;

}

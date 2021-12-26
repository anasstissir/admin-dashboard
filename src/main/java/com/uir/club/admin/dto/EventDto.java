package com.uir.club.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;
    private String title;
    private String responsible;
    private LocalDate startDate;
    private LocalDate endDate;
    private String place;
    private String description;
    private Double budget;
    private String club;
}

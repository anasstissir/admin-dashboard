package com.uir.club.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeetingDto {
    private Long id;
    private String title;
    private String responsible;
    private LocalDate timeMeeting;
    private String place;
    private String description;
    private String club;
}

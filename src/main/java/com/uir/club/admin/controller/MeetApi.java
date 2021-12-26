package com.uir.club.admin.controller;

import com.uir.club.admin.dto.EventDto;
import com.uir.club.admin.dto.MeetingDto;
import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Event;
import com.uir.club.admin.model.Meeting;
import com.uir.club.admin.repository.ClubRepository;
import com.uir.club.admin.repository.EventRepository;
import com.uir.club.admin.repository.MeetingRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/meets")
@AllArgsConstructor
public class MeetApi {

    private MeetingRepository meetingRepository;

    private ClubRepository clubRepository;

    @GetMapping
     public Iterable<Meeting> getMeetings(){
         return meetingRepository.findAll();
     }

    @GetMapping(value = "/{id}")
    public Meeting getMeetingById(@PathVariable Long id){
        return meetingRepository.findById(id).get();
    }

    @PostMapping
    public Meeting addMeeting(@RequestBody MeetingDto meetingDto){
        Long idClub = Long.valueOf(meetingDto.getClub());
        Club target = clubRepository.findById(idClub).get();
        Meeting meeting = new Meeting();
        meeting.setTitle(meetingDto.getTitle());
        meeting.setDescription(meetingDto.getDescription());
        meeting.setPlace(meetingDto.getPlace());
        meeting.setClub(target);
        return meetingRepository.save(meeting);
    }
}

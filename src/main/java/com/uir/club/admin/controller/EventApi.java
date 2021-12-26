package com.uir.club.admin.controller;

import com.uir.club.admin.dto.EventDto;
import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Event;
import com.uir.club.admin.repository.ClubRepository;
import com.uir.club.admin.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventApi {

    private EventRepository eventRepository;

    private ClubRepository clubRepository;

    @GetMapping
     public Iterable<Event> getEvents(){
         return eventRepository.findAll();
     }

    @GetMapping(value = "/{id}")
    public Event getEventById(@PathVariable Long id){
        return eventRepository.findById(id).get();
    }

    @PostMapping
    public Event addEvent(@RequestBody EventDto eventDto){
        Long idClub = Long.valueOf(eventDto.getClub());
        Club target = clubRepository.findById(idClub).get();
        Event event = new Event();
        event.setBudget(eventDto.getBudget());
        event.setTitle(eventDto.getTitle());
        event.setDescription(eventDto.getDescription());
        event.setPlace(eventDto.getPlace());
        event.setEndDate(eventDto.getEndDate());
        event.setStartDate(eventDto.getStartDate());
        event.setClub(target);
        return eventRepository.save(event);
    }
}

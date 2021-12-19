package com.uir.club.admin.repository;

import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Event;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}

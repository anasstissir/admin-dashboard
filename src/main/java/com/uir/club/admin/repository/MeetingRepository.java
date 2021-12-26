package com.uir.club.admin.repository;

import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Meeting;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface MeetingRepository extends PagingAndSortingRepository<Meeting, Long> {
}

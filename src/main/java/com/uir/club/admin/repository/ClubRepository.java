package com.uir.club.admin.repository;

import com.uir.club.admin.model.Club;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "clubs", path = "clubs")
public interface ClubRepository extends PagingAndSortingRepository<Club, Long> {
}

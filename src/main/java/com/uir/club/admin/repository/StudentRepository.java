package com.uir.club.admin.repository;


import com.uir.club.admin.model.Student;
import com.uir.club.admin.model.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository  extends PagingAndSortingRepository<Student, Long> {
}

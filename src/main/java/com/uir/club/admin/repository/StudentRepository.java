package com.uir.club.admin.repository;


import com.uir.club.admin.model.Student;
import com.uir.club.admin.model.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
@CrossOrigin(origins = "*", methods = RequestMethod.GET)
public interface StudentRepository  extends PagingAndSortingRepository<Student, Long> {
    Student findStudentByLogin(String login);
    Student findStudentByLoginAndPassword(String login, String password);
}

package com.uir.club.admin.repository;

import com.uir.club.admin.model.Club;
import com.uir.club.admin.model.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "transactions", path = "transactions")
public interface TransactionRepository  extends PagingAndSortingRepository<Transaction, Long> {
}

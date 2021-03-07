package de.dbck.poc.pochelloworldjpa.hello;

import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends PagingAndSortingRepository<Hello, UUID> {
  List<Hello> findByOrderByCreatedAtDesc();
}

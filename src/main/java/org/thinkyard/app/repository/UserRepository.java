package org.thinkyard.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.thinkyard.app.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

	User findByUsername(String username);

	List<User> findAll();
}

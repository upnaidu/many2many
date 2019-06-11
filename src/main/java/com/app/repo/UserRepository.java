package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

	Users findByUsername(String username);

}

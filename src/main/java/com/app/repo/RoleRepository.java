package com.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Roles;

@Repository
public interface RoleRepository extends CrudRepository<Roles, Long> {

	List<Roles> findByRolename(String rolename);

}

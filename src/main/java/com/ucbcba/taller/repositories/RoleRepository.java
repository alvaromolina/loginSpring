package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Role;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
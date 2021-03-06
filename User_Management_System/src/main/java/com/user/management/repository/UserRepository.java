package com.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.management.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}

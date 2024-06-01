package com.basicRestAPI.basicRestAPI.repository;

import com.basicRestAPI.basicRestAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

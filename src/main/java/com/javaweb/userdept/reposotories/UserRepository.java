package com.javaweb.userdept.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.entity.Users;

public interface UserRepo extends JpaRepository<Users,String>{

}

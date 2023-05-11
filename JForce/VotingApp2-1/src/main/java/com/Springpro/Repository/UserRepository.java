package com.Springpro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springpro.User;



public interface UserRepository extends JpaRepository<User, Long>{

}

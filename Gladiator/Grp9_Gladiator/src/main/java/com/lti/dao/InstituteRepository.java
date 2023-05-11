package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.InstituteRegistration;


@Repository
public interface InstituteRepository extends  JpaRepository<InstituteRegistration, String>{

	InstituteRegistration findByEmailid(String emailid);
}

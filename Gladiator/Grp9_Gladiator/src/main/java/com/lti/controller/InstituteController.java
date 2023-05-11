package com.lti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.InstituteRepository;
import com.lti.entity.InstituteLogin;
import com.lti.entity.InstituteRegistration;

import com.lti.service.InstituteService;
import com.lti.service.InstituteServiceImpl;

@RestController  
@CrossOrigin(origins = "http://localhost:4200")
public class InstituteController {
//
//	@Autowired
//	private InstituteServiceImpl instituteServiceImpl;
//	
	@Autowired
	private InstituteService instituteService;
	
	@Autowired
	private InstituteRepository instituteRepo;
	
	//adding institute
	@PostMapping("/institutes")
	public InstituteRegistration addInstitute(@RequestBody InstituteRegistration application)
	{
		instituteService.addInstitute(application);
		return application;
	}
	
	@PostMapping("/institutelogin")
	public Boolean instituteLogin(@RequestBody InstituteLogin loginObj) {
		String a = loginObj.getUsername();
		String p = loginObj.getPassword();
		List<InstituteRegistration> ls = instituteService.getAllInstituteDetail();
		
		for(InstituteRegistration s : ls) {
			if((a.equals(s.getEmailid())) && (p.equals(s.getPassword()))) {
				return true;
			}
		}
		return false;
	}
	
	@GetMapping("institutes/{emailid}")
	public InstituteRegistration findInstituteByEmailid(@PathVariable String emailid) {
		InstituteRegistration iObj = instituteRepo.findByEmailid(emailid);
		return iObj;
	}
	




		
}


package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.InstituteRepository;
import com.lti.entity.InstituteLogin;
import com.lti.entity.InstituteRegistration;

import com.lti.exception.NoInstituteFoundException;

@Service
public class InstituteServiceImpl implements InstituteService{
	
	@Autowired
	private InstituteRepository instituteRepo;
	
	@Transactional
	@Override
	public InstituteRegistration addInstitute(InstituteRegistration addObj) {
		return instituteRepo.save(addObj);
		
	}

	public List<InstituteRegistration> getAllInstituteDetail() {
		// TODO Auto-generated method stub
		return instituteRepo.findAll();
	}

	
	
	
//	@Override
//	public InstituteLogin findInstituteById(String id) throws NoInstituteFoundException {
//		Optional<InstituteLogin> iFind = instituteCred.findById(id);
//		InstituteLogin inst = null;
//		if(iFind.isPresent()) {
//			inst =  iFind.get();
//		}else {
//			throw new NoInstituteFoundException("Institute not Found Exc called");
//		}
//		return inst;
//	}

}

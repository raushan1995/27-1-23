package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.model.Registration;
import com.cg.repo.Repository;


public class ServiceImp implements Service{
	
    private Repository repo;
	
	@Autowired
	public ServiceImp(Repository repo) {
		super();
		this.repo = repo;
	}

	//post mapping
	@Override
	public Registration addRegistration(Registration reg) {
		// TODO Auto-generated method stub
		Registration savedRegistration = repo.save(reg);
		return savedRegistration;
	}

	//get mapping
	@Override
	public List<Registration> getAllRegistration() {
		// TODO Auto-generated method stub
		return (List<Registration>) repo.findAll();
	}

	@Override
	public void deleteRegistrationByemailId(String emailId) {
		// TODO Auto-generated method stub
		repo.deleteRegistrationByemailId( emailId);
	}

}

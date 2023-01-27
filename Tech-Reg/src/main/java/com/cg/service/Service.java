package com.cg.service;

import java.util.List;

import com.cg.model.Registration;

public interface Service {

    public Registration addRegistration(Registration reg);
	
	public List<Registration>getAllRegistration();
	
	public void deleteRegistrationByemailId(String emailId);
	
	}

package com.cg.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Registration;



public interface Repository extends MongoRepository<Registration, Integer>{

	void deleteRegistrationByemailId(String emailId);

}

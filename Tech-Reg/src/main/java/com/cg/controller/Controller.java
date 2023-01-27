package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.model.Registration;
import com.cg.repo.Repository;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class Controller {

	@Autowired
	private Repository repo;
	
	
	
	//post mappingS
	
			@PostMapping("/addRegistration")
			public String saveRegistration(@RequestBody Registration reg) {
				repo.save(reg);
				return "add with Name: "+ reg.getFullName();
			}
			//get mapping
			
			@GetMapping("/findAllRegistration")
			public List<Registration> getRegistration(){
				return repo.findAll();
			}
			
			@DeleteMapping("/delete/{emailId}") // it is used to delete data into database
			public ResponseEntity<Void> deleteRegistrationByemailId(@PathVariable String emailId) {
			repo.deleteRegistrationByemailId(emailId);
			return ResponseEntity.noContent().build();
			}
}

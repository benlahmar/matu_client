package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.repo.IClient;

@RestController
public class CustomerApi {

	@Autowired
	IClient crepo;
	
	@GetMapping("clients/{id}")
	public Client findc(@PathVariable long id)
	{
		return crepo.findById(id).get();
	}
	
}

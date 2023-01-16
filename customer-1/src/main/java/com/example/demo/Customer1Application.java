package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repo.IClient;

@SpringBootApplication
public class Customer1Application implements CommandLineRunner{

	@Autowired
	IClient crepo;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Customer1Application.class, args);
	}

	@Bean
	public HttpTraceRepository httprepo()
	{
		return new InMemoryHttpTraceRepository();
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client c1=new Client();
		c1.setNom("toi");
		String[] prenoms= {"mohamed","ali"};
		c1.setPrenoms(prenoms);
		c1.setDate(LocalDate.now());
		Adresse adress=new Adresse("ggg", "casa", "maroc", "1000000");
		c1.setAdress(adress);
		
		c1=crepo.save(c1);
		
		
		System.out.println(c1.getId());
	}
}

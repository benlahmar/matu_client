package com.example.demo.repo;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Client;

public interface IClient extends JpaRepository<Client, Long>{

	List<Client> findByNom(String n);
	List<Client> findByDateBetween(LocalDate dd, LocalDate df);
	List<Client> findByAdresseVille(String v);
	List<Client> findByAdresseVilleAndNomStartingWith(String v, String k);
	List<Client> abc(String p1,String p2);
	@Query("from user u where u.nom=?1")
	List<Client> findByinfo(String p);
	
}

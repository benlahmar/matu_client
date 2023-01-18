package com.example.demo.repo;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Client;

public interface IClient extends JpaRepository<Client, Long>{

	
	List<Client> findByNom(String n);
	List<Client> findByDateBetween(LocalDate dd, LocalDate df);
	List<Client> findByAdressVille(String v);
	List<Client> findByAdressVilleAndNomStartingWith(String v, String k);
	List<Client> abc(String p1,String p2);
	@Query("from Client u where u.nom=?1")
	List<Client> findByinfo(String p);
	
	@Procedure
	public List<Client> Getclient();
	
	@Procedure(value = "Getclient")
	public List<Client> clients();
	
}

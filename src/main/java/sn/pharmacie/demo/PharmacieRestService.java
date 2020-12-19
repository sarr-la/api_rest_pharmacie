package sn.pharmacie.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.pharmacie.demo.dao.PharmacieRepository;
import sn.pharmacie.demo.entities.Pharmacie;

@RestController
public class PharmacieRestService {
	@Autowired
	private PharmacieRepository pharmacieRepository;
	
	@RequestMapping(value="/pharmacies",method=RequestMethod.GET)
	public List<Pharmacie> getPharmacies(){
		
		return pharmacieRepository.findAll();
		
	}	

	
	
	@RequestMapping(value="/pharmacies/{id}",method=RequestMethod.GET)
	public Optional<Pharmacie> getPharmacie(@PathVariable int id){
		
		return pharmacieRepository.findById(id);
		
	}	

	
	
}

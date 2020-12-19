package sn.pharmacie.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.pharmacie.demo.dao.PharmacieRepository;
import sn.pharmacie.demo.entities.Pharmacie;

@SpringBootApplication
public class PharmacieApplication implements CommandLineRunner {
	@Autowired
	private PharmacieRepository pharmacieRepository;

	public static void main(String[] args) {
		SpringApplication.run(PharmacieApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		pharmacieRepository.save(new Pharmacie("fall", "darou", "touba", 1));
		pharmacieRepository.save(new Pharmacie("niang", "medine", "guediawaye", 1));
		pharmacieRepository.save(new Pharmacie("gadiaga", "escal", "guediwaye", 1));
		pharmacieRepository.save(new Pharmacie("gueye", "thioce", "mbour", 1));
		
				pharmacieRepository.findAll().forEach(p->{
					System.out.println(p.getNom());
				});
				
			}

		}

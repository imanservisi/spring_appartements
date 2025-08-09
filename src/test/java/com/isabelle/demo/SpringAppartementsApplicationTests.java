package com.isabelle.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.isabelle.demo.entity.Residence;
import com.isabelle.demo.repository.ResidenceRepository;

@SpringBootTest
class SpringAppartementsApplicationTests {

	@Autowired
	private ResidenceRepository residenceRepository;
	@Test
	public void testCreateResidence() {
		Residence residence = new Residence("Résidence 1", "Marseille");
		residenceRepository.save(residence);
	}

	@Test
	public void testFindResidence() {
		Residence residence = residenceRepository.findById(1L).get();
		System.out.println(residence);
	}

	@Test
	public void testUpdateResidence() {
		Residence residence = residenceRepository.findById(1L).get();
		residence.setAdresse("La Ciotat");
		residenceRepository.save(residence);
	}

	@Test
	public void testDeleteResidence() {
		Residence residence = residenceRepository.findById(2L).get();
		residenceRepository.delete(residence);
	}

	@Test
	public void testListerResidences() {
		List<Residence> residences = residenceRepository.findAll();
		for (Residence residence : residences) {
			System.out.println(residence);
		}
	}

}

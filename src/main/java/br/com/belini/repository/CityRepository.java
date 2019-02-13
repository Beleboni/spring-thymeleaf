package br.com.belini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.belini.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
	
}
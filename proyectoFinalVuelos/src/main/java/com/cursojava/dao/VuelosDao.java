/**
 * 
 */
package com.cursojava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.cursojava.models.Vuelo;

/**
 * @author Admin
 *
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer>{

	@Query( value = "SELECT * FROM proyectofinal.vuelos WHERE plazasdisponibles >= ?1", nativeQuery = true)
	List<Vuelo> seleccionarVueloPorPlazaDispo(int reservadas);

}

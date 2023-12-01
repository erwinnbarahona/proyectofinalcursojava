/**
 * 
 */
package com.cursojava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cursojava.models.Hotel;

/**
 * @author Erwin
 *
 */
public interface HotelesDao extends JpaRepository<Hotel, Integer>{

	@Query( value = "SELECT * FROM proyectofinal.hoteles WHERE disponible = 1", nativeQuery = true)
	List<Hotel> seleccionarHotelesDisponibles();

	
	@Query( value = "SELECT * FROM proyectofinal.hoteles WHERE nombre like %:nombre%", nativeQuery = true)
	Hotel seleccionarHotelesPornombre(@Param("nombre") String nombre);

}

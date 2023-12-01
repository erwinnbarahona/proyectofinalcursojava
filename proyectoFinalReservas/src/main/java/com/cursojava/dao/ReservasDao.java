/**
 * 
 */
package com.cursojava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cursojava.models.Reserva;

/**
 * @author Erwin
 *
 */
public interface ReservasDao extends JpaRepository<Reserva, Integer>{
	
	@Query( value = "SELECT * FROM proyectofinal.reservas WHERE idhotel = ?1", nativeQuery = true)
	List<Reserva> listaReservasPorIdhotel(int idhotel);

}

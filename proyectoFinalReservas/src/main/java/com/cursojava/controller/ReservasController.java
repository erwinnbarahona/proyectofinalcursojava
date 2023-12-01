/**
 * 
 */
package com.cursojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.models.Hotel;
import com.cursojava.models.Reserva;
import com.cursojava.services.ReservasServices;

/**
 * @author Erwin
 * Controlador del microservicio de reservas
 */
@RestController
public class ReservasController implements ReservasServices{

	@Autowired
	ReservasServices services;

	//http://localhost:7004/reservas
	@Override
	@PostMapping(value = "reservas")
	public void insertarReserva(@RequestBody Reserva reserva) {

		services.insertarReserva(reserva);

	}


	//http://localhost:7004/reservas/goya
	@Override
	@GetMapping(value = "reservas/no/{nombre}")
	public List<Reserva> listaReserPorNombreHotel(@PathVariable ("nombre") String nombre) {

		return services.listaReserPorNombreHotel(nombre);

	}

	//http://localhost:7004/reservas/goya
	@Override
	@GetMapping(value = "reservas/{nombre}")
	public Hotel hotelIdPorNombre(@PathVariable ("nombre") String nombre) {
		
		return services.hotelIdPorNombre(nombre);
	
	}

}

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
import com.cursojava.services.HotelesServices;

/**
 * @author Erwin
 * Controlador del microservicio de hoteles
 */
@RestController
public class HotelesController implements HotelesServices{

	@Autowired
	HotelesServices services;

	//FUNCIONA CORRECTAMENTE
	//GET - http://localhost:7000/hoteles 
	@Override
	@GetMapping(value = "hoteles")
	public List<Hotel> listaHoteles() {

		return services.listaHoteles();
	}

	//FUNCIONA CORRECTAMENTE
	//GET - http://localhost:7000/hoteles/goya 
	@Override
	@GetMapping(value = "hoteles/{nombre}")
	public Hotel hotelPorNombre(@PathVariable ("nombre") String nombre) {

		return services.hotelPorNombre(nombre);

	}

	//FUNCIONA CORRECTAMENTE
	//GET - http://localhost:7000/hoteles/porid/1
	@Override
	@GetMapping(value = "hoteles/porid/{id}")
	public Hotel hotelPorId(@PathVariable("id") int idhotel) {
		
		return services.hotelPorId(idhotel);
	
	}
	
	//POST - http://localhost:7000/hoteles
	@Override
	@PostMapping(value = "hoteles")
	public void actualizarHotelPorId(@RequestBody Hotel hotel) {
		
		services.actualizarHotelPorId(hotel);
		
	}
	
	//FUNCIONA CORRECTAMENTE
	//POST - http://localhost:7000/hoteles/desactivar/{id}
	@Override
	@PostMapping(value = "hoteles/desactivar/{id}")
	public void desactivarHotelPorId(@PathVariable ("id") int id) {
			
		services.desactivarHotelPorId(id);
		
	}

	//POST - http://localhost:7000/hoteles/activar/{id}
	@Override
	@PostMapping(value = "hoteles/activar/{id}")
	public void activarHotelPorId(@PathVariable ("id") int id) {
		
		services.activarHotelPorId(id);
		
	}



}

/**
 * 
 */
package com.cursojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.models.Vuelo;
import com.cursojava.services.VuelosServices;

/**
 * @author Erwin
 * Controlador del microservicio de vuelos
 *
 */
@RestController
public class VuelosController implements VuelosServices{

	@Autowired
	VuelosServices services;

	//FUNCIONA CORRECTAMENTE
	//GET - http://localhost:7002/vuelos/{plazas}
	@Override
	@GetMapping(value = "vuelos/{plazas}")
	public List<Vuelo> listaVuelosDiponibles(@PathVariable ("plazas") int plazas) {

		return services.listaVuelosDiponibles(plazas);

	}

	//FUNCIONA CORRECTAMENTE
	//PUT - http://localhost:7002/vuelos/{idvuelo}/{plazas}
	@Override
	@PutMapping(value = "vuelos/{idvuelo}/{plazas}")
	public void actualizarVueloPorId(@PathVariable ("idvuelo") int idvuelo, @PathVariable ("plazas") int plazas) {

		services.actualizarVueloPorId(idvuelo, plazas);

	}

	//FUNCIONA CORRECTAMENTE
	//GET - http://localhost:7002/vuelos/porid/{idvuelo}
	@Override
	@GetMapping(value = "vuelos/porid/{idvuelo}")
	public Vuelo vueloPorId(@PathVariable ("idvuelo") int idvuelo) {

		return services.vueloPorId(idvuelo);

	}



}

/**
 * 
 */
package com.cursojava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.dao.VuelosDao;
import com.cursojava.models.Vuelo;

/**
 * @author Erwin
 *
 */
@Service
public class VuelosServicesimpl implements VuelosServices{

	@Autowired
	VuelosDao dao;

	//FUNCIONA CORRECTAMENTE
	//GET - DEVUELVE LA LISTA DE VUELOS DISPONIBLES. 
	//EN LA URL SE ENVIARAN LAS PLAZAS Y SE DEVUELVEN LOS QUE SI SOPORTEN DICHA CANTIDAD.
	@Override
	public List<Vuelo> listaVuelosDiponibles(int plazas) {

		return dao.seleccionarVueloPorPlazaDispo(plazas);

	}

	//PUT - SE ACTUALIZAN LOS DATOS DEL VUELO INDICADO . 
	//EN LA URL SE ENVIARAN EL ID Y LAS PLAZAS RESERVADAS.
	@Override
	public void actualizarVueloPorId(int id, int plazasResevadas) {
		Vuelo vuelo = dao.findById(id).orElse(null);
		vuelo.setPlazasDisponibles(vuelo.getPlazasDisponibles() -  plazasResevadas);
		dao.save(vuelo);

	}

	//GET - DEVUELVE UN VUELO DE LA BASE DE DATOS FILTRANDO POR LA ID. 
	//EN LA URL SE ENVIARAN EL ID 
	@Override
	public Vuelo vueloPorId(int idvuelo) {

		return dao.findById(idvuelo).orElse(null);

	}



}

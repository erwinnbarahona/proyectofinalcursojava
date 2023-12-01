/**
 * 
 */
package com.cursojava.services;

import java.util.List;

import com.cursojava.models.Vuelo;

/**
 * @author Admin
 *
 */
public interface VuelosServices {

	//GET - DEVUELVE LA LISTA DE VUELOS DISPONIBLES. 
	//EN LA URL SE ENVIARAN LAS PLAZAS Y SE DEVUELVEN LOS QUE SI SOPORTEN DICHA CANTIDAD.
	List<Vuelo> listaVuelosDiponibles(int plazas);

	//PUT - SE ACTUALIZAN LOS DATOS DEL VUELO INDICADO . 
	//EN LA URL SE ENVIARAN EL ID Y LAS PLAZAS RESERVADAS.
	void actualizarVueloPorId(int id, int plazasResevadas);

	//GET - DEVUELVE UN VUELO DE LA BASE DE DATOS FILTRANDO POR LA ID. 
	//EN LA URL SE ENVIARAN EL ID 
	Vuelo vueloPorId(int idvuelo);

}

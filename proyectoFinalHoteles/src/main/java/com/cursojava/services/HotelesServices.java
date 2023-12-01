/**
 * 
 */
package com.cursojava.services;

import java.util.List;

import com.cursojava.models.Hotel;

/**
 * @author Erwin
 *
 */
public interface HotelesServices {

	// GET - DEVUELVE LA LISTA DE LOS HOTELES DISPONIBLES
	List<Hotel> listaHoteles();

	//GET - DEVUELVE LOS DATOS DE LOS HOTELES FILTRANDO POR SU NOMBRE
	Hotel hotelPorNombre(String nombre);
	
	//GET - DEVUELVE UN HOTEL FILTRANDO POR SU ID
	Hotel hotelPorId(int idhotel);
	
	//POST - ACTUALZIAR UN HOTEL FILTRANDO POR SU ID DE LA BASE DE DATOS
	void actualizarHotelPorId(Hotel hotel);
	
	//POST - DESACTIVA UN HOTEL FILTRANDO POR SU ID DE LA BASE DE DATOS
	void desactivarHotelPorId(int id);
	
	//POST - ACTIVA UN HOTEL FILTRANDO POR SU ID DE LA BASE DE DATOS
	void activarHotelPorId(int id);

}

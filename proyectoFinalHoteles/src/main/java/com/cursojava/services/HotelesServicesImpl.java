/**
 * 
 */
package com.cursojava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.dao.HotelesDao;
import com.cursojava.models.Hotel;

/**
 * @author Erwin
 *
 */
@Service
public class HotelesServicesImpl implements HotelesServices{

	@Autowired
	HotelesDao dao;

	// GET - DEVUELVE LA LISTA DE LOS HOTELES DISPONIBLES 
	@Override
	public List<Hotel> listaHoteles() {

		return dao.seleccionarHotelesDisponibles();

	}

	//GET - DEVUELVE LOS DATOS DE LOS HOTELES FILTRANDO POR SU NOMBRE
	@Override
	public Hotel hotelPorNombre(String nombre) {

		return dao.seleccionarHotelesPornombre(nombre); 

	}

	//GET - DEVUELVE UN HOTEL FILTRANDO POR SU ID
	@Override
	public Hotel hotelPorId(int idhotel) {

		return dao.findById(idhotel).orElse(null);

	}

}

/**
 * 
 */
package com.cursojava.services;

import java.util.List;

import com.cursojava.models.Hotel;
import com.cursojava.models.Reserva;

/**
 * @author Admin
 *
 */
public interface ReservasServices {

	//POST - RECIBE EN EL CUERPO LA INFORMACIÓN PARA GUARDAR LA RESERVA EN LA BASE DE DATOS.
	void insertarReserva(Reserva reserva);

	//GET - DEVUELVE UNA LISTA DE RESERVAS EXISTENTES.
	//SE FILTRA POR EL NOMBRE DEL HOTEL QUE SE PASA POR LA URL.
	//DEBE INTERACCIONAR CON EL SERVICIO DE HOTELES PARA SABER SU ID A PARTIR DE SU NOMBRE.
	List<Reserva> listaReserPorNombreHotel(String nombre);

	//GET - HOTEL POR NOMBRE
	Hotel hotelIdPorNombre(String nombre);

}

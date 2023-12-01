/**
 * 
 */
package com.cursojava.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cursojava.dao.ReservasDao;
import com.cursojava.models.Hotel;
import com.cursojava.models.Reserva;
import com.cursojava.models.Vuelo;


/**
 * @author Erwin
 *
 */
@Service
public class ReservasServicesImpl implements ReservasServices{

	@Autowired
	RestTemplate template;
	@Autowired
	ReservasDao dao;
	private String URL_VUELOS = "http://localhost:7002/vuelos/";
	private String URL_HOTELES = "http://localhost:7000/hoteles/";


	//SE COMUNICA CON EL CONTROLADOR DE VUELOS PARA VERFICAR QUE EL VUELO DE LA RESERVA TIENE DISPONIBLE LOS ASIENTOS QUE SE DESEA ADQUIRIR.
	//SE COMUNICA CON EL CONTROLADO DE VUELOS PARA ACTUALIZAR LAS PLAZAS DE LOS VUELOS.
	//POST - RECIBE EN EL CUERPO LA INFORMACIÓN PARA GUARDAR LA RESERVA EN LA BASE DE DATOS.
	@Override
	public void insertarReserva(Reserva reserva) {
		Vuelo vuelo = template.getForObject(URL_VUELOS + String.valueOf(reserva.getIdVuelo()) , Vuelo.class);
		Hotel hotel = template.getForObject(URL_HOTELES + String.valueOf(reserva.getIdHotel()) , Hotel.class);
		if (vuelo != null && hotel != null) {
			if (vuelo.getPlazasDisponibles() > 0 ) {

				template.put(URL_VUELOS + "{idvuelo}/{plazas}" + 1, null, reserva.getIdVuelo() , 1);
				dao.save(reserva);

			}

		}

		System.out.println("Contacte con su proveedor. Reserva no realizada = DATOS DE LA RESERVA ERRONEOS");

	}


	//GET - DEVUELVE UNA LISTA DE RESERVAS EXISTENTES.
	//SE FILTRA POR EL NOMBRE DEL HOTEL QUE SE PASA POR LA URL.
	//DEBE INTERACCIONAR CON EL SERVICIO DE HOTELES PARA SABER SU ID A PARTIR DE SU NOMBRE.
	@Override
	public List<Reserva> listaReserPorNombreHotel(String nombre) {

		Hotel hotel = template.getForObject(URL_HOTELES + "{nombre}" , null, nombre);

		return dao.listaReservasPorIdhotel(hotel.getHotelId());

	}


	@Override
	public Hotel hotelIdPorNombre(String nombre) {

		List<Hotel> listaHoteles = Arrays.asList(template.getForObject(URL_HOTELES + "{nombre}", Hotel[].class, nombre));

		for (Hotel hotel : listaHoteles) {
			if (hotel.getNombre().equals(nombre)) {
				return hotel;
			}
		}
		
		return null;
	
	}








}

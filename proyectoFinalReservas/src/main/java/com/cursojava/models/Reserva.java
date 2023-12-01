/**
 * 
 */
package com.cursojava.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Erwin
 *
 */
@Entity
@Table(name= "reservas")
public class Reserva {

	@Id
	@Column(name = "idreserva")
	private int idReserva;
	@Column(name = "nombrecliente")
	private String nombreCliente;
	private String dni;
	@Column(name = "idhotel")
	private int idHotel;
	@Column(name = "idvuelo")
	private int idVuelo;
	
	public Reserva() {
		super();
	}

	public Reserva(String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public Reserva(int idReserva, String nombreCliente, String dni, int idHotel, int idVuelo) {
		super();
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
}

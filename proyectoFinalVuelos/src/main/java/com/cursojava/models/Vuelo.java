/**
 * 
 */
package com.cursojava.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Erwin
 *
 */
@Entity
@Table(name= "vuelos")
public class Vuelo {
	
	@Id
	@Column(name = "idvuelo")
	private int idVuelo;
	private String compania;
	@Column(name = "fechavuelo")
	private LocalDate fechaVuelo;
	private double precio;
	@Column(name = "plazasdisponibles")
	private int plazasDisponibles;
	
	public Vuelo() {
		super();
	}

	public Vuelo(String compania, LocalDate fechaVuelo, double precio, int plazasDisponibles) {
		super();
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}

	public Vuelo(int idVuelo, String compania, LocalDate fechaVuelo, double precio, int plazasDisponibles) {
		super();
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

}

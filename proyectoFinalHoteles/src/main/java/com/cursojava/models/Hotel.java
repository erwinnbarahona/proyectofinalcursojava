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
@Table(name= "hoteles")
public class Hotel {

	@Id
	@Column(name = "idhotel")
	private int idHotel;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;

	public Hotel() {
		super();
	}

	public Hotel(String nombre, int categoria, double precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public Hotel(int hotelId, String nombre, int categoria, double precio, boolean disponible) {
		super();
		this.idHotel = hotelId;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public int getHotelId() {
		return idHotel;
	}

	public void setHotelId(int hotelId) {
		this.idHotel = hotelId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}

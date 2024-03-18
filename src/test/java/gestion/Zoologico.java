package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public Zoologico() {}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadAnimales = 0;
		for (Zona i : zonas) {	
			cantidadAnimales += i.cantidadAnimales();
		}
		return cantidadAnimales;
	}
	
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	
	// Setters
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {	
		this.ubicacion = ubicacion;
	} 
	
	public void setZona(ArrayList<Zona> zonas){	
		this.zonas = zonas;
	}
	
}
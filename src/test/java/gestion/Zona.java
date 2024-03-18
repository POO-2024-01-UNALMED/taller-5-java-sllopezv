package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico [] zoo = new Zoologico[1];
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
	}
	
	public Zona() {}
	
	public void agregarAnimales(Animal animal) {	
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	
	// Getters
	public String getNombre() {	
		return nombre;
	}
	
	public Zoologico getZoo() {	
		return zoo[0];
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	// Setters
	public void setNombre(String nombre) {	
		this.nombre = nombre;
	}
	
	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
	}
}
package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int animales_creados;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {	
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		animales_creados++;
	}
	
	public Mamifero() {
		listado.add(this);
		animales_creados++;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		boolean pelaje = true;
		int patas = 4;
		String habitat = "pradera";
		Mamifero caballo = new Mamifero (nombre, edad, habitat, genero, pelaje, patas);
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		boolean pelaje = true;
		int patas = 4;
		String habitat = "selva";
		Mamifero leon = new Mamifero (nombre, edad, habitat, genero, pelaje, patas);
		leones++;
		return leon;
	}
	
	
	// Getters
	public int getPatas() {
		return patas;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public static int cantidadMamiferos() {
		return animales_creados;
	}
	
	
	// Setters
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setpatas(int patas) {
		this.patas = patas;
	}
}
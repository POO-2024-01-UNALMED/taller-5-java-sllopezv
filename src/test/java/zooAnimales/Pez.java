package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
    private ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    public static int peces_creados;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
        peces_creados++;
    }

    public Pez() {
        listado.add(this);
        peces_creados++;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        String habitat = "oceano";
        String colorEscamas = "gris";
        int cantidadAletas = 6;
        Pez bacalao = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        bacalaos++;
        return bacalao;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        String habitat = "oceano";
        String colorEscamas = "rojo";
        int cantidadAletas = 6;
        Pez salmon = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
        salmones++;
        return salmon;
    }

    public String movimiento() {
        return "nadar";
    }

    // Getters
    public String getColorEscamas() {
        return colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    // Setters
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces() {
        return peces_creados;
    }
}

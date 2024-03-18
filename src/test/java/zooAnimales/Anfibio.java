package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
    private ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public static int anfibios_creados;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        anfibios_creados++;
    }

    public Anfibio() {
        listado.add(this);
        anfibios_creados++;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        String habitat = "selva";
        String colorPiel = "rojo";
        boolean venenoso = false;
        Anfibio rana = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
        ranas++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        String habitat = "selva";
        String colorPiel = "negro y amarillo";
        boolean venenoso = false;
        Anfibio salamandra = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
        salamandras++;
        return salamandra;
    }

    public String movimiento() {
        return "saltar";
    }

    // Getters
    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    // Setters
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios() {
        return anfibios_creados;
    }
}

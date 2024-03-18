package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public static int aves_creadas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
        aves_creadas++;
    }

    public Ave() {
        listado.add(this);
        aves_creadas++;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        String habitat = "montanas";
        String colorPlumas = "cafe glorioso";
        Ave halcon = new Ave(nombre, edad, habitat, genero, colorPlumas);
        halcones++;
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        String habitat = "montanas";
        String colorPlumas = "blanco y amarillo";
        Ave aguila = new Ave(nombre, edad, habitat, genero, colorPlumas);
        aguilas++;
        return aguila;
    }

    public String movimiento() {
        return "volar";
    }

    // Getters
    public String getColorPlumas() {
        return colorPlumas;
    }

    // Setters
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves() {
        return aves_creadas;
    }
}

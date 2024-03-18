package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
    private ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public static int reptiles_creados;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
        reptiles_creados++;
    }

    public Reptil() {
        listado.add(this);
        reptiles_creados++;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        String habitat = "jungla";
        String colorEscamas = "blanco";
        int largoCola = 1;
        Reptil serpiente = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
        serpientes++;
        return serpiente;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        String habitat = "humedal";
        String colorEscamas = "verde";
        int largoCola = 3;
        Reptil iguana = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
        iguanas++;
        return iguana;
    }

    public String movimiento() {
        return "reptar";
    }

    // Getters
    public int getLargoCola() {
        return largoCola;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    // Setters
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public static int cantidadReptiles() {
        return reptiles_creados;
    }
}

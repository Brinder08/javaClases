package org.example.ejercicio1;

public class Digimon {
    private String nombre;
    private int ataque;
    private double defensa;
    private boolean vivo;

    public Digimon(String nombre, int ataque, double defensa, boolean vivo) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void evolucion(){}

    @Override
    public String toString() {
        return "Digimon{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", vivo=" + vivo +
                '}';
    }
}

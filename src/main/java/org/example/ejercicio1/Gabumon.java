package org.example.ejercicio1;

public class Gabumon extends Digimon{
    private int nivel;

    public Gabumon(String nombre, int ataque, double defensa, boolean vivo, int nivel) {
        super(nombre,ataque,defensa,vivo);
        this.nivel=nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void evolucion(){
        System.out.println("Garurumon");
    }

    @Override
    public String toString() {
        return "Gabumon{" +
                "nombre='" + getNombre() + '\'' +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", vivo=" + isVivo() +
                ", nivel=" + nivel +
                '}';
    }
}

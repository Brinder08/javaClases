package org.example.ejercicio1;

public class Betamon extends Digimon{
    private double peso;

    public Betamon(String nombre, int ataque, double defensa, boolean vivo, double peso) {
        super(nombre,ataque,defensa,vivo);
        this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public void evolucion(){
        System.out.println("Seadramon");
    }

    @Override
    public String toString() {
        return "Betamon{" +
                "nombre='" + getNombre() + '\'' +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", vivo=" + isVivo() +
                ", peso=" + peso +
                '}';
    }
}

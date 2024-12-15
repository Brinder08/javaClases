package org.example.ejercicio1;

public class Agumon extends Digimon{
    private String familia;

    public Agumon(String nombre, int ataque, double defensa, boolean vivo, String familia) {
        super(nombre,ataque,defensa,vivo);
        this.familia=familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public void evolucion(){
        System.out.println("Greymon");
    }

    @Override
    public String toString() {
        return "Agumon{" +
                "nombre='" + getNombre() + '\'' +
                ", ataque=" + getAtaque() +
                ", defensa=" + getDefensa() +
                ", vivo=" + isVivo() +
                ", familia='" + familia +
                '}';
    }
}

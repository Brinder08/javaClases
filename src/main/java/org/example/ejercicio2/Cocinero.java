package org.example.ejercicio2;

public class Cocinero extends Empleado{
    private String plato;
    private Integer numRecetas;

    public Cocinero(String nombre, String apellido, Integer edad, Double altura, Double peso, Boolean antecedentes, Integer identificacion, String trabajo, Boolean desempleado, String plato, Integer numRecetas) {
        super(nombre, apellido, edad, altura, peso, antecedentes, identificacion, trabajo, desempleado);
        this.plato = plato;
        this.numRecetas = numRecetas;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Integer getNumRecetas() {
        return numRecetas;
    }

    public void setNumRecetas(Integer numRecetas) {
        this.numRecetas = numRecetas;
    }

    @Override
    public void gustos() {
        System.out.println("Me gusta cocinar");;
    }

    @Override
    public String toString() {
        return "Cocinero{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", antecedentes=" + getAntecedentes() +
                ", identificacion=" + getIdentificacion() +
                ", trabajo='" + getTrabajo() + '\'' +
                ", desempleado=" + getDesempleado() +
                ", plato='" + plato + '\'' +
                ", numero de recetas=" + numRecetas +
                '}';
    }
}

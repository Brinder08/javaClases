package org.example.ejercicio2;

public class Lavandero extends Empleado{
    private Integer numRopa;
    private Boolean ropaBlanca;

    public Lavandero(String nombre, String apellido, Integer edad, Double altura, Double peso, Boolean antecedentes, Integer identificacion, String trabajo, Boolean desempleado, Integer numRopa, Boolean ropaBlanca) {
        super(nombre, apellido, edad, altura, peso, antecedentes, identificacion, trabajo, desempleado);
        this.numRopa = numRopa;
        this.ropaBlanca = ropaBlanca;
    }

    public Integer getNumRopa() {
        return numRopa;
    }

    public void setNumRopa(Integer numRopa) {
        this.numRopa = numRopa;
    }

    public Boolean getRopaBlanca() {
        return ropaBlanca;
    }

    public void setRopaBlanca(Boolean ropaBlanca) {
        this.ropaBlanca = ropaBlanca;
    }

    @Override
    public void gustos() {
        System.out.println("Me gusta lavar");;
    }

    @Override
    public String toString() {
        return "Lavandero{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", antecedentes=" + getAntecedentes() +
                ", identificacion=" + getIdentificacion() +
                ", trabajo='" + getTrabajo() + '\'' +
                ", desempleado=" + getDesempleado() +
                ", numero de ropa=" + numRopa +
                ", la ropa es blanca=" + ropaBlanca +
                '}';
    }
}

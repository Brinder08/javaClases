package org.example.ejercicio2;

public class Jefe extends Empleado{
    private String tipo;
    private Double ganancia;

    public Jefe(String nombre, String apellido, Integer edad, Double altura, Double peso, Boolean antecedentes, Integer identificacion, String trabajo, Boolean desempleado, String tipo, Double ganancia) {
        super(nombre, apellido, edad, altura, peso, antecedentes, identificacion, trabajo, desempleado);
        this.tipo = tipo;
        this.ganancia = ganancia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getGanancia() {
        return ganancia;
    }

    public void setGanancia(Double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public void gustos() {
        System.out.println("Me gusta mandar");;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", antecedentes=" + getAntecedentes() +
                ", identificacion=" + getIdentificacion() +
                ", trabajo='" + getTrabajo() + '\'' +
                ", desempleado=" + getDesempleado() +
                ", tipo='" + tipo + '\'' +
                ", ganancia=" + ganancia +
                '}';
    }
}

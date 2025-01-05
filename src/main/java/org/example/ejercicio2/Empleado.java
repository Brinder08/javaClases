package org.example.ejercicio2;

public class Empleado extends Persona{
    private Integer identificacion;
    private String trabajo;
    private Boolean desempleado;

    public Empleado(String nombre, String apellido, Integer edad, Double altura, Double peso, Boolean antecedentes, Integer identificacion, String trabajo, Boolean desempleado) {
        super(nombre, apellido, edad, altura, peso, antecedentes);
        this.identificacion = identificacion;
        this.trabajo = trabajo;
        this.desempleado = desempleado;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public Boolean getDesempleado() {
        return desempleado;
    }

    public void setDesempleado(Boolean desempleado) {
        this.desempleado = desempleado;
    }

    @Override
    public void gustos() {
        System.out.println("Sin marcar");;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", antecedentes=" + getAntecedentes() +
                ", identificacion=" + identificacion +
                ", trabajo='" + trabajo + '\'' +
                ", desempleado=" + desempleado +
                '}';
    }
}

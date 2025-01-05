package org.example.ejercicio2;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Double altura;
    private Double peso;
    private Boolean antecedentes;

    public Persona(String nombre, String apellido, Integer edad, Double altura, Double peso, Boolean antecedentes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.antecedentes = antecedentes;
    }

    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(Boolean antecedentes) {
        this.antecedentes = antecedentes;
    }

    public void gustos() {}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", antecedentes=" + antecedentes +
                '}';
    }
}

package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        //Ejercicio 1
        int cursosMayor5Horas = (int) cursos.stream().filter(curso -> curso.getDuracion() > 5).count();
        System.out.println("\nCantidad de cursos con duración mayor a 5 horas: " + cursosMayor5Horas);

        //Ejercicio 2
        int cursosMenor2Horas = (int) cursos.stream().filter(curso -> curso.getDuracion() < 2).count();

        System.out.println("\nCantidad de cursos con duración menor a 2 horas: " + cursosMenor2Horas);

        //Ejercicio 3
        System.out.println("\nCursos con una cantidad de vìdeos mayor a 50: ");
        cursos.stream()
                .filter(curso -> curso.getVideos() > 50)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        //Ejercicio 4
        System.out.println("\nLos 3 cursos con mayor duraciòn: ");
        cursos.stream()
                .sorted(Comparator.comparing(Curso::getDuracion).reversed())
                .limit(3)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        //Ejercicio 5
        float duracionTotal = (float) cursos.stream().mapToDouble(Curso::getDuracion).sum();
        System.out.println("\nDuración total de todos los cursos: " + duracionTotal + " horas");

        //Ejercicio 6
        float promedioDuracion = (float) cursos.stream().mapToDouble(Curso::getDuracion).average().orElse(0);
        System.out.println("\nCursos con duración mayor al promedio (" + promedioDuracion + " horas):");
        cursos.stream()
                .filter(curso -> curso.getDuracion() > promedioDuracion)
                .map(Curso::getTitulo)
                .forEach(System.out::println);

        //Ejercicio 7
        System.out.println("\nCursos con menos de 500 alumnos: ");
        cursos.stream()
                .filter(curso -> curso.getAlumnos() < 500)
                .map(curso -> curso.getTitulo() + " - " + curso.getDuracion() + "horas")
                .forEach(System.out::println);

        //Ejercicio 8
        Optional<Curso> cursoMayorDuracion = cursos.stream()
                .max(Comparator.comparing(Curso::getDuracion));
        cursoMayorDuracion.ifPresent(curso -> System.out.println("\nCurso con mayor duración: "
                + curso.getTitulo() + " - "
                + curso.getDuracion() + " horas"));

        //Ejercicio 9
        List<String> titulosCursos = cursos.stream()
                .map(Curso::getTitulo)
                .collect(Collectors.toList());
        System.out.println("\nLista de tìtulos de los cursos:");
        titulosCursos.forEach(System.out::println);
    }
}

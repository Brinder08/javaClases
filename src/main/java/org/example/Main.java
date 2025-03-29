package org.example;




import org.example.ejercicio3.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
//        Digimon Agumon= new Agumon("Carlos",13,7.9,true,"Dragones");
//        Digimon Gabumon= new Gabumon("Roberto", 15,17.8,false,7);
//        Digimon Betamon=  new Betamon("Gonzalo",22,26.7,true,45.8);
//
//        System.out.println(Agumon.toString());
//        Agumon.evolucion();
//        System.out.println("---------------------");
//        System.out.println(Gabumon.toString());
//        Gabumon.evolucion();
//        System.out.println("---------------------");
//        System.out.println(Betamon.toString());
//        Betamon.evolucion();

        //Ejercio 2

//        Persona Cocinero= new Cocinero("Jorge", "Sanchez",34,1.65,63.5,false,5462,"Cocinero",false,"Carapulcra",14);
//        Persona Jefe= new Jefe("Luis", "Pereira",31,1.72,56.3,true,1853,"Jefe",false,"Empresarial",20500.50);
//        Persona Lavandero=new Lavandero("Mario","Roman",20,1.79,72.6,false,6233,"Lavandero",true,00,false);
//
//        System.out.println(Cocinero.toString());
//        Cocinero.gustos();
//        System.out.println("---------------------------");
//        System.out.println(Jefe.toString());
//        Jefe.gustos();
//        System.out.println("---------------------------");
//        System.out.println(Lavandero.toString());
//        Lavandero.gustos();
//        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        //Ejercicio 3
//        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);
//        Function<List<Integer>, Integer> suma = list -> list.stream()  // Convertimos la lista en un stream
//                .reduce(0, Integer::sum);  // Sumamos los elementos
//        System.out.println(suma.apply(integerList));
//        System.out.println("---------------------------");
//        List<Integer> integerList = List.of(12, 4, 16, 5, 6);
//        Function<List<Integer>, Integer> multiplicacion = list -> list.stream()
//                .reduce(1, Math::multiplyExact);
//        System.out.println(multiplicacion.apply(integerList));
//        System.out.println("---------------------------");

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
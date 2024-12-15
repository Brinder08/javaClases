package org.example;

import org.example.ejercicio1.Agumon;
import org.example.ejercicio1.Betamon;
import org.example.ejercicio1.Digimon;
import org.example.ejercicio1.Gabumon;

import java.util.List;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //Ejercicio 1
        Digimon Agumon= new Agumon("Carlos",13,7.9,true,"Dragones");
        Digimon Gabumon= new Gabumon("Roberto", 15,17.8,false,7);
        Digimon Betamon=  new Betamon("Gonzalo",22,26.7,true,45.8);

        System.out.println(Agumon.toString());
        Agumon.evolucion();
        System.out.println("---------------------");
        System.out.println(Gabumon.toString());
        Gabumon.evolucion();
        System.out.println("---------------------");
        System.out.println(Betamon.toString());
        Betamon.evolucion();


        //Ejercicio 3
//        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);
//        Function<List<Integer>, Integer> suma = list -> list.stream()  // Convertimos la lista en un stream
//                .reduce(0, Integer::sum);  // Sumamos los elementos
//        System.out.println(suma.apply(integerList));
    }
}
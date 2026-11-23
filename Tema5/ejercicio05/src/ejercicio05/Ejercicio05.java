/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 * Program: programa el que le pidas al usuario las notas de las 6 asignaturas del
 * Ciclo de DAM y te calcule la nota media del curso.
 * @author RusudanKimadze
 */
public class Ejercicio05 {
    
    /**
     * El metodo para pedir una nota a usuario y devolver esta nota;
     * @return 
     */
    public static float pedirNota(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    /**
     * El metodo para calcular nota media entre 6 notas
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @param nota5
     * @param nota6
     * @return 
     */
    public static float calcularNotaMedia(float nota1, float nota2, float nota3,
                                            float nota4, float nota5, float nota6){
        return (nota1+nota2+nota3+nota4+nota5+nota6)/Asignatura.mostratCantidadDeAsignaturas();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la nota de Programación: ");
        float nota1 = pedirNota();
        Asignatura asignatura1 = new Asignatura("Programacion");
        asignatura1.setNota(nota1);
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        float nota2 = pedirNota();
        Asignatura asignatura2 = new Asignatura("Lenguajes de Marcas");
        asignatura2.setNota(nota2);
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        float nota3 = pedirNota();
        Asignatura asignatura3= new Asignatura("Bases de Datos");
        asignatura3.setNota(nota3);
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        float nota4 = pedirNota();
        Asignatura asignatura4 = new Asignatura("Entornos de Desarrollo");
        asignatura4.setNota(nota4);
        
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        float nota5 = pedirNota();
        Asignatura asignatura5 = new Asignatura("Sistemas Informáticos");
        asignatura5.setNota(nota5);
        
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        float nota6 = pedirNota();
        Asignatura asignatura6 = new Asignatura("Formación y Orientación Laboral");
        asignatura6.setNota(nota6);
        
        
        System.out.println("Tienes en total: " + Asignatura.mostratCantidadDeAsignaturas() + " asignaturas. \n"+ 
                "Su nota media del curso es de: " +
                              calcularNotaMedia(asignatura1.getNota(), asignatura2.getNota(),
                                      asignatura3.getNota(), asignatura4.getNota(), asignatura5.getNota(),asignatura6.getNota()));
    }
    
}

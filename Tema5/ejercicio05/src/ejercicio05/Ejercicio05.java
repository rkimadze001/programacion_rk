/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {
    
    public static float pedirNota(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public static float calcularNotaMedia(float nota1, float nota2, float nota3,
                                            float nota4, float nota5, float nota6){
        return (nota1+nota2+nota3+nota4+nota5+nota6)/6;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la nota de Programación: ");
        float nota1 = pedirNota();
        Asignatura a1 = new Asignatura("Programacion", nota1);
        a1.setNota(nota1);
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        float nota2 = pedirNota();
        Asignatura a2 = new Asignatura("Lenguajes de Marcas", nota2);
        a2.setNota(nota2);
        
        System.out.println("Introduzca la nota de Bases de Datos: ");
        float nota3 = pedirNota();
        Asignatura a3 = new Asignatura("Bases de Datos", nota3);
        a3.setNota(nota3);
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        float nota4 = pedirNota();
        Asignatura a4 = new Asignatura("Entornos de Desarrollo", nota4);
        a4.setNota(nota4);
        
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        float nota5 = pedirNota();
        Asignatura a5 = new Asignatura("Sistemas Informáticos", nota5);
        a5.setNota(nota5);
        
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        float nota6 = pedirNota();
        Asignatura a6 = new Asignatura("Sistemas Informáticos", nota6);
        a6.setNota(nota6);
        
        
        System.out.println("Su nota media del curso es de: ");
        System.out.println(calcularNotaMedia(a1.getNota(), a2.getNota(),a3.getNota(), a4.getNota(), a5.getNota(),a6.getNota()));
    }
    
}

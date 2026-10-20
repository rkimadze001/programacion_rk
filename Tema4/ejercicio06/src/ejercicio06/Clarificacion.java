/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 * programa: el usuario introduzca la nota de un alumno (número entero entre 0 y
 * 10) en el main, y se le pasará a un método que escribirá su calificación
 * según el valor de la nota ingresada: • 0 a 4 = Suspenso. • 5 a 6 = Bien. • 7
 * a 8 = Notable. • 9 a 10 = Sobresaliente.
 * @author alumno
 */
public class Clarificacion {
    /**
     * El metodo para imprimir el mensage especifico para cada nota
     * @param nota 
     */
    public static void clarification(int nota){
        //condicional para imprimir error en plantaa si nota no es entre 0 y 10
        if(nota < 0 || nota > 10){
            System.out.println("Upps error! Entra nota entre 0 y 10!!!");
        }
        
        //bucle para imprimir mensages diferentes con notas especificos. 
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso!");
                break;
            case 5:
            case 6:
                System.out.println("Bien!");
                break;
            case 7:
            case 8:
                System.out.println("Notable!");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}

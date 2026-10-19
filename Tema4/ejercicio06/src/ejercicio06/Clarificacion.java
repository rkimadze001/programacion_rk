/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alumno
 */
public class Clarificacion {
    public static void clarification(int nota){
        if(nota < 0 || nota > 10){
            System.out.println("Upps error! Entra nota entre 0 y 10!!!");
        }
        
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

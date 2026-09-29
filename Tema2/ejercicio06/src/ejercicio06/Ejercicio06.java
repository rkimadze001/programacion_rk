/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *Program: el usario introduzca la nota de un alumno (numero entero entre 0 y 10).
 * y escribira su calificacion.
 * @author RusudanKimadze
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notaDeAlumno;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa tu nota (entre 0 y 10): ");
        
        notaDeAlumno = entrada.nextInt();
        
        switch (notaDeAlumno){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso.");
                break;
            case 5:
            case 6:
                System.out.println("Bien.");
                break;
            case 7:
            case 8:
                System.out.println("Notable.");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Ups Error!!!...La nota introducida no esta entre 0 y 10.");
        }
        
    }
    
}

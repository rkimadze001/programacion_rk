/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *programa: el usuario introduzca la nota de un alumno (número entero entre 0 y
 * 10) en el main, y se le pasará a un método que escribirá su calificación
 * según el valor de la nota ingresada: • 0 a 4 = Suspenso. • 5 a 6 = Bien. • 7
 * a 8 = Notable. • 9 a 10 = Sobresaliente.
 * @author RusudanKimadze
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variable
        int nota;
        
        //nuevo instancia de objeto Scanner y pedir el numero a usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entra tu nota aqui: ");
        nota = entrada.nextInt();
        
        //llamar metodo clarificacion en main
        Clarificacion.clarification(nota);
             
    }
    
}

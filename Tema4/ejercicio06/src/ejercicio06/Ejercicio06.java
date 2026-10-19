/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author RusudanKimadze
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entra tu nota aqui: ");
        nota = entrada.nextInt();
        
        //llamar metodo clarificacion en main
        Clarificacion.clarification(nota);
             
    }
    
}

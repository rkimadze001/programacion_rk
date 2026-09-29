/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;

/**
 * Programa: le pida al usuario un número por teclado. Posteriormente, el
 * programa le dirá al usuario si el número introducido es par o impar.
 * @author RusudanKimadze
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroEntrado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el numero: ");
        numeroEntrado = entrada.nextInt();
        
        if(numeroEntrado % 2 == 0){
            System.out.println("El numero "+ numeroEntrado +" es par");
        }else {
            System.out.println("El numero " + numeroEntrado + " es impar");
        }
    }
}

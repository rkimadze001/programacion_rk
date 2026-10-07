/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * programa: calcule sume dos números que introduzca el usuario y en caso de
 * que el usuario introduzca una letra en vez de un número, debemos capturar la
 * excepción y mostrarle un mensaje de error.
 * @author RusudanKimadze
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral variables
        int numero1, numero2, suma;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca primero numero: ");
        
        //control de excepciones
        try{
            numero1 = entrada.nextInt();
            System.out.println("Introduzca segundo numero: ");
            numero2 = entrada.nextInt();
            suma = numero1 + numero2;
            System.out.println("La suma de los numeros es: " + suma);
            
        }catch(InputMismatchException e){
            System.out.println("Upss error: por favor entra un numero!");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 * program: se le pide al usuario (en el main) un número por teclado. Luego se
 * llamará a un método que pasándole número introducido por el usuario, nos dirá
 * si el número introducido es positivo o negativo.
 *
 * @author RusudanKimadze
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUsuario;
        //crear nuevo instance de la objeto Scanner y pedir el numero de usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        numeroUsuario = entrada.nextInt();
        
        //llamar el metodo en main
        serPositivo(numeroUsuario);
    }
    
    /**
     * El metodo para comprobar si el numero es positivo o negativo y 
     * imprimir en la pantalla
     * @param numero 
     */
    public static void serPositivo (int numero){
        
        //condicional para comprobar si el numero es positivo o negativo
        if(numero > 0){
            System.out.println("El número introducido es positivo.");
        }else if (numero < 0){
            System.out.println("El número introducido es negativo.");
        }else{
            System.out.println("El numero no es positivo o negativo.");
        }
    }
}

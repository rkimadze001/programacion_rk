/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 * Programa: le pida al usuario un número por teclado y le dirá al usuario
 * si el número introducido es positivo o negativo.
 * @author RusudanKimadze
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroEntrada; 
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        numeroEntrada = entrada.nextInt();
        
        //condiciones y resultados
        if(numeroEntrada > 0){
            System.out.println("El numero introducido es positivo.");
        }else if (numeroEntrada < 0){
            System.out.println("El numero introducido es negativo.");
        } else {
            System.out.println("El numero es 0.");
        }
        
    }
    
}

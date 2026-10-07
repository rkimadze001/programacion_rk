/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 * Programa: calcule el resultado de dividir los números que introduzca el
 * usuario y en caso de que el usuario introduzca un número divisor igual a 0, 
 * captura la excepción y mostrarle un mensaje de error al usuario.
 * @author RusudanKimadze
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declarar variables
        int numero1, numero2, resultado;
        
        //pedir unos numeros
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entra primero numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Entra segundo numero: ");
        numero2 = entrada.nextInt();
        
        //calclular un dato (conflictivo)
        try{
            resultado = numero1/numero2;
            System.out.println("La resultado de divicion es: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Upss error, divisor no podria ser 0");
        }   
                     
 }
}

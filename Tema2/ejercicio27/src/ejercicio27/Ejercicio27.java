/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import  java.util.Scanner;

/**
 *Programa: para calcular el cuadrado y el cubo de un número entero introducido 
 * por teclado y muestrar los resultados.
 * 
 * @author RusudanKimadze
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numeroEntrada, cuadradoDeNumero, cuboDeNumero;
        
        System.out.print("Por favor, intorduzca un numero: ");
        numeroEntrada = entrada.nextInt();
        
        //calculation de los cuadrado y cubo.
        
        cuadradoDeNumero = numeroEntrada * numeroEntrada;
        cuboDeNumero = numeroEntrada * numeroEntrada * numeroEntrada;
        
        //printando resultades en la pantalla. 
        System.out.println("El doble de " + numeroEntrada+ " es: " + cuadradoDeNumero);
        System.out.println("El cubo de " + numeroEntrada+ " es: " + cuboDeNumero);

    }
    
}

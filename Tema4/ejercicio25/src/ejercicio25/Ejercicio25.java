/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 * programa: Contenga un método que calcule la potencia de un número (a)
 * elevado a un número (b) que se le pasan como párametros.
 * @author ruskakimadze
 */
public class Ejercicio25 {

    /**
     * El metodo para pedir el numero a usuario y devolver este numero
     * @return 
     */
    public static double numeroEntrada(){
        double numero;
        
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextDouble();
        
        return numero;
    }
    
    /**
     * El metodo para calcular potencia de numero a elevado a b y devolver este 
     * resultado.
     * @param a
     * @param b
     * @return 
     */
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // inicializar variables
        double a, b, resultado;
        
        //Mostrar mensages y guardar valores de que el usuario va a introducir
        System.out.println("Por favor introduzca un numero a: ");
        a = numeroEntrada();
        
        System.out.println("Ahora introduzca un numero b: ");
        b = numeroEntrada();
        
        //condicional para mostrar error si el usuario intentarla calcular el potencia de 
        //la 0 elevado a numero negativo
       if(a == 0 && b < 0){
          System.out.println("La potencia de 0 no podria ser negativo. ");

       }else{
          resultado = potencia(a,b);
          System.out.println("La potencia de un numero "+ a +" elevado a un numero " + b + " es: " + resultado);

       }
    }
    
}

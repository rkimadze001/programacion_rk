/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio25 {

    
    public static double numeroEntrada(){
        double numero;
        
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextDouble();
        
        return numero;
    }
    
    
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, resultado = 0;
        
        
        System.out.println("Por favor introduzca un numero a: ");
        a = numeroEntrada();
        
        System.out.println("Ahora introduzca un numero b: ");
        b = numeroEntrada();
        
        
        //try{
        //     resultado = potencia(a, b);
        //}catch(ArithmeticException e){
        //    System.out.println("La potencia de 0 no podria ser negativo. ");
        //}
        
       if(a == 0 && b < 0){
          System.out.println("La potencia de 0 no podria ser negativo. ");

       }else{
          System.out.println("La potencia de un numero "+ a +" elevado a un numero " + b + " es: " + resultado);

       }
    }
    
}

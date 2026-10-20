/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 * Programa: el que el usuario introduzca
 * cuatro números enteros (en el main), y que se los pase a un método que los
 * muestre por pantalla ordenados de forma creciente (de menor a mayor).
 * @author Rusudan Kimadze
 */
public class Ejercicio07 {
    
    
    /**
     * El metodo ordena cuatro numeros de forma creciente.
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenar(int num1, int num2, int num3, int num4){
        int aux;
        
       //necesitamos tres iteraciones y usamos bucle
       for(int i = 0; i < 3; i++){
           //comparar primero y segundo numero y cambiar citios si el primero es mayor
           if(num1 > num2){
               aux = num2;
               num2 = num1;
               num1 = aux;   
           }
           //comparar segundo y tercero numero y cambiar citios si el segundo es mayor
           if(num2 > num3){
               aux = num3;
               num3 = num2;
               num2 = aux;   
           }
           //comparar tercero y cuarto numero y cambiar citios si el tercero es mayor
           if(num3 > num4){
               aux = num4;
               num4 = num3;
               num3 = aux;   
           }
       }
       
      //imprimir en la pantalla 
        System.out.println("El orden de los números introducidos es el " + num1 + " - "+ num2 +
                " - "+ num3 +" - "+ num4);
    }
    
    /**
     * El método main pide el usuario cuatro números y llama método ordenar 
     * @param args 
     */
    public static void main(String[] args) {
        //declarar variables
        int num1, num2, num3, num4;
        
        Scanner entrada = new Scanner(System.in);
        
        //pedir numero a usuario
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        //llamar metodo ordenar en main
        ordenar(num1, num2, num3, num4);
    }
    
}

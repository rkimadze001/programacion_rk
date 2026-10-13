/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author RusudanKimadze
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        int primeroNumero, segundoNumero, numeroElegido, resultado=0;
        
        //pedir entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un primero numero: ");
        primeroNumero = entrada.nextInt();
            
        System.out.println("Introduzca un segundo numero: ");
        segundoNumero = entrada.nextInt();
        
        //bucle para optiones
        do{
            
            System.out.println("Por favor elegir numero de tu operacion: ");
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            
            numeroElegido = entrada.nextInt();
            switch (numeroElegido){
                case 1: 
                    resultado = primeroNumero + segundoNumero;
                    System.out.println("Resultado de sumar es: " + resultado);
                    break;
                case 2: 
                    resultado = primeroNumero - segundoNumero;
                    System.out.println("Resultado de restar es: " + resultado);
                    break;
                case 3: 
                    resultado = primeroNumero * segundoNumero;
                    System.out.println("Resultado de multiplicar es: " + resultado);
                    break;
                case 4: 
                    try{
                        resultado = primeroNumero / segundoNumero;  
                    System.out.println("Resultado de dividir es: " + resultado);

                    }catch(ArithmeticException e){
                        System.out.println("No podemos dividir a 0.");             
                    }
                    break;
             }
        }while(numeroElegido != 5);
    }
    
}

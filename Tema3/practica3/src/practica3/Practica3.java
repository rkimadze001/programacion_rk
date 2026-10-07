/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa: practica de tema4
 * @author RusudanKimadze
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       
       try{
            //pedir un dato (conflictivo)
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca su edad: ");
            edad = entrada.nextInt();
            System.out.println("Tu edad es: " + edad);
       } catch(InputMismatchException e){
            System.out.println("Dato no valido; debes introducir un numero entero.");
       } finally {
           System.out.println("Dato pedido al usuario.");
       }

    }
    
}


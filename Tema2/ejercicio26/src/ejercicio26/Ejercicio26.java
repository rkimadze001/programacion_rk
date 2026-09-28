/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;

/**
 * Ejercicio 26.- Desarrolla un programa en el que le pidas al usuario
un número de 4 cifras y muestre por pantalla cada una de las cifras
que lo forman.
• Muestra por pantalla el resultado de la siguiente forma:
Por favor, introduzca un número de 4 cifras: XYZW
La primera cifra es: X
La segunda cifra es: Y
La tercera cifra es: Z
La cuarta cifra es: W
* 
 * @author Rusudan Kimadze
 */


public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        // TODO code application logic 
        
        int primeraCifra, segundaCifra, terceraCifra, cuarteraCifra, cifras;
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        
        cifras = entrada.nextInt();
        cuarteraCifra = cifras%10;
        terceraCifra = cifras%100/10;
        segundaCifra = cifras%1000%100%10;
        primeraCifra = cifras%1000;
        
    }
    
}

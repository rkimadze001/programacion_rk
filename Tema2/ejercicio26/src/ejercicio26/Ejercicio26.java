/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 * Ejercicio N26
 * Program: Toma un número de 4 dígitos y devuelve cada dígito por separado mencionando su posición en el número.
 * @author Rusudan Kimadze
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        // TODO code application logic 
        
        int primeraCifra, segundaCifra, terceraCifra, cuarteraCifra, cifras;
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        
        cifras = entrada.nextInt();
        
        cuarteraCifra = cifras%10;
        terceraCifra = (cifras/10)%10;
        segundaCifra = (cifras/100)%10;
        primeraCifra = cifras/1000;
        
        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: " + terceraCifra);
        System.out.println("La cuarta cifra es: " + cuarteraCifra);
    }
    
}

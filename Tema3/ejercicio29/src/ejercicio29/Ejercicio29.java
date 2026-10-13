/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.Scanner;

/**
 * Programa: que juegue con el usuario a adivinar un número. El ordenador debe
 * generar un número entero aleatorio entre 1 y 100, y el usuario tiene que
 * intentar adivinarlo.
 * @author RusudanKimadze
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //varble declaracion y inicializacion 
        
        double aleatorio = Math.floor(Math.random() * 100 +1);
        int aleatorioEntero = (int) aleatorio;
        int numeroEntrada, cont = 0 ;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("---- Juego: adivinar un número ----");
        //bulce para pider el numero a usuario
        do{
            System.out.println("Por favor entra un numero entre 1 y 100: ");
            numeroEntrada = entrada.nextInt();
            cont ++;
            
            if(aleatorioEntero > numeroEntrada){
                System.out.println("El numero que tienes que adivinar es mayor que el numero introducido.");
            }else if (aleatorioEntero < numeroEntrada){
                System.out.println("El numero que tienes que adivinar es menor que el numero introducido.");
            }else {
                System.out.println("Adivinaste el número!!!");
            }
        }while(numeroEntrada == aleatorioEntero);
        
        
    }
    
}

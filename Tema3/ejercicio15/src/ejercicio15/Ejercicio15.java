/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 * Programa: utilizando bucles, imprima la tabla de multiplicar de un número que
 * elija el usuario.
 * @author RusudanKimadze
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral variables
        int numeroEntrado, resultado;
        
        //pedir information a usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        numeroEntrado = entrada.nextInt();
        
        //bucle para muestrar resultados en la pantalla
        for(int i=0; i < 10; i++){
            resultado = numeroEntrado * i;
            System.out.println(numeroEntrado + " x " + i + " = " + resultado);
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 * Programa: Implementa un algoritmo en JAVA que, utilizando bucles, imprima los
 * 100 primeros números pares.
 * @author RusudanKimadze
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral y iniciar variables
        int count = 0;
        int num = 0;
        
        //bucle para imprimir primer 100 par numeros
       while(count < 100){
           if(num%2 == 0){
               System.out.println(num);
               count++;
           }
           num++;
        }
        
    }
    
}

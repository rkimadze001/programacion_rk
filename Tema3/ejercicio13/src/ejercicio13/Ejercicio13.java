/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 * Program:utilizando un bucle while, imprima los números pares que existen
 * entre el número 11 y el número 133.
 * @author RusudanKimadze
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaral y iniciar variables
        int numeroPrimero = 11;
        int numeroUltimo = 133;
        
        //bulcle para imprimir numro si es par
        while(numeroPrimero<numeroUltimo){
            if(numeroPrimero % 2 ==0){
               System.out.println(numeroPrimero);
            }
            numeroPrimero++;
        }
    }
    
}

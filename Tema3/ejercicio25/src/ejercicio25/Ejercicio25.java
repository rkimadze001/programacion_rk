/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 * Programa: que diga la suma total de los números pares existentes entre el
 * número 17 y el número 139.
 * @author RusudanKimadze
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral y inicializar variables
        int primeroNumero = 17;
        int ultimoNumero = 139;
        int suma = 0;
        
        //bucle para calcular suma
        for(int i=primeroNumero; i < ultimoNumero; i++ ){
            if (i % 2 == 0){
                suma += i;
            }
        }
        
        //imprimir la suma
        System.out.println("La Suma de los numeros pares entre " + primeroNumero 
                + " y " + ultimoNumero + " es: " + suma);
    }
    
}

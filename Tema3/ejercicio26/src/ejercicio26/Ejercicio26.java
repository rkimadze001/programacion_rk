/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 * Program: que te diga la suma total de los números impares existentes entre el
 * 111 y el 222.
 * @author RusudanKimadze
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral y inicializar variables
        int primeroNumero = 111;
        int ultimoNumero = 222;
        int suma = 0;
        
        //bucle para calcular suma
        for(int i=primeroNumero; i < ultimoNumero; i++ ){
            if (i % 2 != 0){
                suma += i;
            }
        }
        
        //imprimir la suma
        System.out.println("La Suma de los numeros impares entre " + primeroNumero 
                + " y " + ultimoNumero + " es: " + suma);
    }
    
}

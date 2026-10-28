/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio21 {
    
    
    
    public static int pedirNumero(){
        int numeroEntrada;
        
       
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        
        return numeroEntrada;
    }
    
    public static int comprobarNumeros(int numUno, int numDos){
        while(numDos <= numUno){
            System.out.println("Por favor entra numero que es mayor que primero");
            Scanner entradaDos = new Scanner(System.in);
            numDos = entradaDos.nextInt();
        }
        return numDos;
        
    }
    
    
    public static void mostrarResultado(int primeroNumero, int ultimoNumero){
        int sum = 0;
        for (int i = primeroNumero; i<ultimoNumero; i++){
           if(i % 2 == 0){
               sum += i;
           }        
        }
        
        System.out.println("La suma da numeros pares entre " + primeroNumero + " y " + ultimoNumero + " es: " +sum);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int primeroNumero, ultimoNumero;
         
         System.out.println("Por favor introduzca el primero numero: ");
         primeroNumero = pedirNumero();
         System.out.println("Ahora introduzca el segundo numero: ");
         ultimoNumero = pedirNumero();
         
         ultimoNumero = comprobarNumeros(primeroNumero, ultimoNumero);
         
         mostrarResultado (primeroNumero, ultimoNumero);
    }
    
}

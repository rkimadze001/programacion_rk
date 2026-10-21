/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio13 {
    
    
    public static int pedirNumero(){
        int numeroEntrada;
        
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        
        return numeroEntrada;
    }
    
    
    public static boolean esMayor(int numero){
        
        return numero > 1;  
        
    }
    
    public static void mostrarResultado(int numero){
        
        System.out.println("Los numero entre 1 y " + numero + " son: ");
        
        for(int i = 1; i < numero; i++){
            System.out.print(" - " + i + " ");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroUltimo;
        boolean mayor;
        
        do{ 
            System.out.println("Por favor introduzca un numero mayor de 1: ");
            numeroUltimo = pedirNumero();
            mayor = esMayor(numeroUltimo);
            
            if(mayor){
                mostrarResultado(numeroUltimo);
            }else{
                System.out.println("Error!!! Numero entrado no es mayor de 1, intentar otra vez: ");
            }
    
        }while(!mayor);
        
    }
    
}

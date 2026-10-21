/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 * programa: imprima todos los números existentes entre el número 1 y otro
 * introducido por el usuario.
 * @author ruskakimadze
 */
public class Ejercicio13 {
    
    /**
     * El metodo le pide el numero a usuario
     * @return 
     */
    public static int pedirNumero(){
        int numeroEntrada;
        
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        
        return numeroEntrada;
    }
    
    /**
     * El metodo va a volver true si el numero es mayor de 1 o false en el caso contratio
     * @param numero
     * @return 
     */
    public static boolean esMayor(int numero){
        
        return numero > 1;  
        
    }
    
    /**
     * El metodo muestra resultado en la pantalla
     * @param numero 
     */
    public static void mostrarResultado(int numero){
        
        System.out.println("Los numero entre 1 y " + numero + " son: ");
       // bucle para imprimir todos los numeros entre 1 y el numero entrado a usuario
        for(int i = 1; i < numero; i++){
            System.out.print(" - " + i + " ");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        int numeroUltimo;
        boolean mayor;
        
        //bucle para combinar y llamar cada metodo necesitario para muestrar nuestro resultado
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
